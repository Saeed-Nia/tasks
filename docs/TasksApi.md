# TasksApi

All URIs are relative to *https://localhost/test/1.0/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tasksValidateBracketsGet**](TasksApi.md#tasksValidateBracketsGet) | **GET** /tasks/validateBrackets | Checks if brackets in a string are balanced


<a name="tasksValidateBracketsGet"></a>
# **tasksValidateBracketsGet**
> BalanceTestResult tasksValidateBracketsGet(input)

Checks if brackets in a string are balanced

Brackets in a string are considered to be balanced if the following criteria are met: - For every opening bracket (i.e., **&#x60;(&#x60;**, **&#x60;{&#x60;**, or **&#x60;[&#x60;**), there is a matching closing bracket (i.e., **&#x60;)&#x60;**, **&#x60;}&#x60;**, or **&#x60;]&#x60;**) of the same type (i.e., **&#x60;(&#x60;** matches **&#x60;)&#x60;**, **&#x60;{&#x60;** matches **&#x60;}&#x60;**, and **&#x60;[&#x60;** matches **&#x60;]&#x60;**). An opening bracket must appear before (to the left of) its matching closing bracket. For example, **&#x60;]{}[&#x60;** is not balanced. - No unmatched braces lie between some pair of matched bracket. For example, **&#x60;({[]})&#x60;** is balanced, but **&#x60;{[}]&#x60;** and **&#x60;[{)]&#x60;** are not balanced.

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.TasksApi;


TasksApi apiInstance = new TasksApi();
String input = "input_example"; // String | Input string (max length 50)
try {
    BalanceTestResult result = apiInstance.tasksValidateBracketsGet(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#tasksValidateBracketsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | **String**| Input string (max length 50) |

### Return type

[**BalanceTestResult**](BalanceTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

