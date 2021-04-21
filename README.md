Task:
Let's assume we have an online shop.

Design the tables structure, to be able to accommodate Products with multiple prices (one per day),
which can be in different currencies. We should have the exchange rates for each one in our own database
(consider only a few examples for demonstration purposes), to be able to give only the price in EUR in the response.
Create a new app in Java (version 1.8+) that requires to expose a REST API, which has an embeddeddatabase behind.
Create a new endpoint that receives as input a product code, and based on it, it returns its latest known price in
EUR(latest available price in our DB), only if it’s valid (assume we have a flag that states the validity).

In case a non-valid product is found, return an appropriate message code.Create a new batch Job which can process up to 1M records.
The job should export all the valid products (assume we have a flag that states the validity), each night,
with their latest price in EUR, intoa CSV file.Optional: Consider that the app is a global one, the currency and validation/error
message should be available on the official country language.

Please consider the performance and processing time

Development steps:
1. Create initial structure of app - Products with multiple prices
2. Add multiple currencies
3. Add exchange rates
4. Create method: receives as input a product code, and based on it, it returns its latest known price in
                  EUR(latest available price in our DB), only if it’s valid (assume we have a flag that states the validity).

5. Create batch job
6. Create cron job to run batch job
7. Internationalization
8. Revise performance
9. Dockerize app

Extra: make exhange rate per day

