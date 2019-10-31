# Android Best Practices Sprint Challenge

## Introduction

**Please read this entire README to make sure you understand what is expected of you before you begin.**

This sprint challenge is designed to ensure that you are competent with the concepts taught throughout Sprint 13.

In your solution, it is especially important that you follow best practices such as MVC and good, consistent code style. You will be scored on these aspects as well as the project MVP (minimum viable product) requirements below.

Fork this repository and clone your fork to your computer. Create your Android Studio project in this cloned fork repository folder, then commit and create a pull request. Commit appropriately as you work. When finished, push your final project to GitHub and comment on the pull request to indicate that your project is complete.

You have *3 hours*, and you should work *independently* — looking things up (search, notes) is all fair game. And questions about *process* / *logistics* (i.e. if you have a hard time opening/saving to GitHub) are fair game too.

Good luck!

## Description

We are going to build a RecyclerView of makeup products using the [Makeup API](https://makeup-api.herokuapp.com/). No designs will be provided, however, you should use Material design best-practices with a standard color palette and UI.

Your application should allow a user to search for a brand of products, and then display those products and images in a RecyclerView. Take a look at other top Android apps for design inspiration. The RecyclerView should display these fields for [this kind of API response](http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline):
* Name
* Price
* Image
* Rating

Note that the linked API response above has `maybelline` hardcoded; your application should allow users to enter a brand and then display the appropriate products for that brand. Also, you can use a tool like JsonLint or JsonViewer to visually inspect the format of the Json API response.

## Requirements
1. Build a model that defines the 4 required fields in the description above
2. Build a Service Wrapper that uses Retrofit to Query the makeup API (hint: use the `@Query` annotation in your Retrofit definition)
3. Your Service Wrapper from Requirement 2 should use RxJava and return an `Observable<List<>>`
4. Use Dagger 2 to make your Service Wrapper Injectable
5. Build a simple Activity for searching the API and presenting the results in a `RecyclerView`
6. Inject your Service Wrapper and wire it up to the search UI and `RecyclerView`

## Stretch Goals
1. Add Crashlytics crash reporting to your app
2. Add Firebase instrumentation to your app to track user interactions
3. Add a `CompositeDisposable` to your Activity, and add the Rx Disposable to it. Clear the `CompositeDisposable` when your Activity is destroyed.  
