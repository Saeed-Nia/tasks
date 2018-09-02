# TodoApi

All URIs are relative to *https://localhost/test/1.0/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**todoIdGet**](TodoApi.md#todoIdGet) | **GET** /todo/{id} | Retrieve a specific item by id
[**todoIdPatch**](TodoApi.md#todoIdPatch) | **PATCH** /todo/{id} | Modify an item
[**todoPost**](TodoApi.md#todoPost) | **POST** /todo | Create a to do item


<a name="todoIdGet"></a>
# **todoIdGet**
> ToDoItem todoIdGet(id)

Retrieve a specific item by id

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.TodoApi;


TodoApi apiInstance = new TodoApi();
BigDecimal id = new BigDecimal(); // BigDecimal | id
try {
    ToDoItem result = apiInstance.todoIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodoApi#todoIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**| id |

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="todoIdPatch"></a>
# **todoIdPatch**
> ToDoItem todoIdPatch(id, body)

Modify an item

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.TodoApi;


TodoApi apiInstance = new TodoApi();
BigDecimal id = new BigDecimal(); // BigDecimal | id
ToDoItemUpdateRequest body = new ToDoItemUpdateRequest(); // ToDoItemUpdateRequest | 
try {
    ToDoItem result = apiInstance.todoIdPatch(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodoApi#todoIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**| id |
 **body** | [**ToDoItemUpdateRequest**](ToDoItemUpdateRequest.md)|  |

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="todoPost"></a>
# **todoPost**
> ToDoItem todoPost(body)

Create a to do item

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.TodoApi;


TodoApi apiInstance = new TodoApi();
ToDoItemAddRequest body = new ToDoItemAddRequest(); // ToDoItemAddRequest | 
try {
    ToDoItem result = apiInstance.todoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TodoApi#todoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ToDoItemAddRequest**](ToDoItemAddRequest.md)|  |

### Return type

[**ToDoItem**](ToDoItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

