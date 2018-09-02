# MiscApi

All URIs are relative to *https://localhost/test/1.0/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statusGet**](MiscApi.md#statusGet) | **GET** /status | Return system&#39;s status


<a name="statusGet"></a>
# **statusGet**
> StatusResponse statusGet()

Return system&#39;s status

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.MiscApi;


MiscApi apiInstance = new MiscApi();
try {
    StatusResponse result = apiInstance.statusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscApi#statusGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

