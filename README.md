# t1-verival

Precisa de JDK 17 e Maven no PATH.

Testes:

```
mvn test
```

PIT (só a suite `CalculadoraDescontosTest` em `br.pucrs.mutacao`):

```
mvn test-compile org.pitest:pitest-maven:mutationCoverage -DtargetTests=CalculadoraDescontosTest
```

PIT (goal padrão do plugin):

```
mvn pitest:mutationCoverage
```

Relatório HTML:

```
target/pit-reports/index.html
```

No Windows, abre esse `index.html` no navegador (pasta `target` fica na raiz do repo).
