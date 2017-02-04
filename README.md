### OAuth2対応リソースサーバーAPIの使い方サンプル


[`flaky-frontend-server`](https://github.com/jsug-projects/flaky-frontend-server)を起動して、

http://localhost:8080/token

にアクセス。`token`の値をコピー。(GitHub APIへのトークンなので注意)


リソースサーバーAPIへのアクセスは

```
curl -v -H "Authorization: bearer <token>" localhost:18080/dummy 
```




