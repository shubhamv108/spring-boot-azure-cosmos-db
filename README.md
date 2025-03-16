1. Start cosmos db
```docker compose up -d```

2. Fetch certificate
```curl -k https://localhost:8081/_explorer/emulator.pem > ~/emulatorcert.crt```

3. Add certificate to keystore
```cd $JAVA_HOME/lib/security```
```keytool -importcert -alias cacerts -keystore cacerts -file ~/emulatorcert.crt```

4. ```
   -Djavax.net.ssl.trustStore=/usr/lib/jvm/jdk-21-oracle-x64/lib/security/cacerts
   -Djavax.net.ssl.trustStoreType=JKS
   ```
   


