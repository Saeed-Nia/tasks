# TestApi

All URIs are relative to *https://localhost/test/1.0/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrationTestGet**](TestApi.md#integrationTestGet) | **GET** /integrationTest | Run integration tests against remote API


<a name="integrationTestGet"></a>
# **integrationTestGet**
> IntegrationTestResult integrationTestGet(url)

Run integration tests against remote API

### Example
```java
// Import classes:
//import com.autogeneral.tasks.handler.ApiException;
//import com.autogeneral.tasks.handler.TestApi;


TestApi apiInstance = new TestApi();
String url = "url_example"; // String | base url of remote API to test
try {
    IntegrationTestResult result = apiInstance.integrationTestGet(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestApi#integrationTestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| base url of remote API to test |

### Return type

[**IntegrationTestResult**](IntegrationTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

