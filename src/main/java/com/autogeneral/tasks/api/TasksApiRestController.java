/**
 * 
 */
package com.autogeneral.tasks.api;

import java.util.Stack;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.autogeneral.tasks.model.BalanceTestResult;

/**
 * @author Saeed Nia
 *
 */
@RestController
public class TasksApiRestController implements TasksApi {

	@Override
	public ResponseEntity<BalanceTestResult> tasksValidateBracketsGet(
			@NotNull @Size(min = 1, max = 50) @Valid String input) {
		Stack<Character> stack = new Stack<Character>();
		
		BalanceTestResult balanceTestResult = new BalanceTestResult();
		balanceTestResult.setInput(input);

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if ((c == ')' && (stack.isEmpty() || stack.pop() != '('))
					|| (c == ']' && (stack.isEmpty() || stack.pop() != '['))
					|| (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {

				balanceTestResult.setIsBalanced(false);
				break;
			}
		}
		if (balanceTestResult.isIsBalanced() == null) {
			balanceTestResult.setIsBalanced(stack.isEmpty());
		}
		return ResponseEntity.ok().body(balanceTestResult);
	}

}
