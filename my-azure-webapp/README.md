# My Azure Web App (Java Spring Boot)

## Enna Install Pannanum (Idha first pannu)
1. VS Code — https://code.visualstudio.com
2. Java 17 — https://adoptium.net
3. Maven — https://maven.apache.org/download.cgi
4. Git — https://git-scm.com/downloads

Install aana apparam, terminal la verify pannu:
```
java -version
mvn -version
git --version
```

## Project Ah Eppadi Run Pandradhu
1. Indha zip ah extract pannu (oru folder varum: `my-azure-webapp`)
2. VS Code open pannu → File → Open Folder → `my-azure-webapp` select pannu
3. VS Code la Terminal open pannu (Terminal → New Terminal)
4. Indha command run pannu:
   ```
   mvn spring-boot:run
   ```
5. Browser la po: http://localhost:8080
6. "Hello from my Java Web App!" nu varum na — SUCCESS!

## GitHub Ku Push Pandradhu
Terminal la (same folder la), indha commands one by one run pannu:

```
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/YOUR_USERNAME/my-azure-webapp.git
git branch -M main
git push -u origin main
```

(GitHub la first oru repo create pannitu, adha URL ah mேலே `YOUR_USERNAME` place la paste pannu)

Push pannumbodhu password kekkumbodhu — GitHub password vela seyyathu, Personal Access Token (PAT) venum. Adha eppadi create pandradhu nu theriyaama irundha kேlu, sollen.

## Doubt Irundha
Edhavadhu error vandha, exact error message ah screenshot or copy-paste pannitu kேlu — fix panni tharen. All the best! 💪
