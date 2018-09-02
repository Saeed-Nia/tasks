/**
 * 
 */
package com.autogeneral.tasks.api;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.autogeneral.tasks.model.ToDoItem;
import com.autogeneral.tasks.model.ToDoItemAddRequest;
import com.autogeneral.tasks.model.ToDoItemUpdateRequest;

/**
 * @author Saeed Nia
 *
 */
@RestController
public class TodoApiRestController implements TodoApi {

	@Override
	public ResponseEntity<ToDoItem> todoIdGet(BigDecimal id) {
		// TODO Auto-generated method stub
		return TodoApi.super.todoIdGet(id);
	}

	@Override
	public ResponseEntity<ToDoItem> todoIdPatch(BigDecimal id, @Valid ToDoItemUpdateRequest body) {
		// TODO Auto-generated method stub
		return TodoApi.super.todoIdPatch(id, body);
	}

	@Override
	public ResponseEntity<ToDoItem> todoPost(@Valid ToDoItemAddRequest body) {
		// TODO Auto-generated method stub
		return TodoApi.super.todoPost(body);
	}

}
