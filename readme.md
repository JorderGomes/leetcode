# LeetCode Solutions

Este repositório serve como um **caderno de estudos e um laboratório prático** para problemas de algoritmos e estruturas de dados do [LeetCode](https://leetcode.com/). Meu objetivo aqui é explorar diferentes abordagens para resolver desafios comuns de programação, com foco na otimização e na comparação de desempenho entre linguagens e algoritmos.

Cada solução é acompanhada por uma explicação detalhada, pseudocódigo e instruções claras sobre como executar o código. A ideia é não apenas resolver os problemas, mas também entender a fundo o "porquê" de cada escolha de design algorítmico e a influência da linguagem de programação.

---

## Two Sum

Este repositório apresenta duas soluções distintas para o problema "Two Sum" do LeetCode, implementadas em linguagens e com complexidades algorítmicas diferentes. O objetivo é demonstrar a diferença de performance entre uma abordagem otimizada (usando um Hash Map) e uma mais direta, porém menos eficiente (Força Bruta), ao mesmo tempo em que se explora as características de linguagens como Python e Java. A solução mais otimizada foi implementada em Python, uma linguagem geralmente mais lenta em tempo de execução, para realçar o ganho algorítmico. Por outro lado, a solução de força bruta foi implementada em Java, uma linguagem conhecida por sua performance, para ver como uma abordagem ineficiente se comporta mesmo em um ambiente mais rápido.

-----

### Solução implementada em Python

A solução em Python utiliza a abordagem de **Hash Map**, que oferece uma complexidade de tempo de *O(n)* (linear). Ela percorre a lista de números apenas uma vez. Para cada número, calcula-se o "complemento" necessário para atingir o `target`. Em seguida, verifica-se rapidamente se esse complemento já foi visto e armazenado no `hash_map`. Se sim, significa que o par foi encontrado e seus índices são retornados. Caso contrário, o número atual e seu índice são adicionados ao `hash_map` para futuras verificações. Esta é uma forma muito eficiente de resolver o problema, pois a busca e inserção em um hash map têm, em média, tempo constante.

**Pseudocódigo:**

```
- Definir o Hash
- Para cada elemento da lista:
    - Calcular o complemento
    - Buscar o complemento no Hash
    - Se for encontrado:
        - Retornar uma lista com o índice do elemento atual e o índice do complemento
    - Se não for encontrado:
        - Salvar no hash o elemento atual como chave e seu índice como valor
```

**Como executar o código Python:**

1.  Salve o código acima em um arquivo chamado, por exemplo, `solution_python.py`.
2.  Para testar, você pode adicionar algumas chamadas de teste ao final do arquivo, ou simplesmente copiar a classe para um ambiente de execução LeetCode ou um *notebook* Python.
3.  Abra seu terminal ou prompt de comando.
4.  Navegue até o diretório onde o arquivo `solution_python.py` está salvo.
5.  Execute o script com o comando:
    ```bash
    python solution_python.py
    ```

-----

### Solução implementada em Java

A solução em Java emprega a abordagem de **Força Bruta** (Brute Force), que tem uma complexidade de tempo de *O(n²)* (quadrática). Esta solução itera sobre cada número na lista e, para cada um deles, itera novamente sobre os números restantes para encontrar um par cuja soma seja igual ao `target`. Embora simples de entender e implementar, essa abordagem se torna muito ineficiente para listas grandes, pois o número de operações cresce exponencialmente com o tamanho da entrada.

**Pseudocódigo:**

```
- Para cada elemento i de nums
    - Para cada elemento j de nums que vem depois de i
        - Se a soma dos elementos i e j for igual ao target
            - Retorna os índices i e j como um array
- Se nenhum par for encontrado, retorna um array com zeros
```

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima):

    ```java
    public class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();

            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = sol.twoSum(nums1, target1);
            System.out.println("Input: [2,7,11,15], Target: 9 -> Output: [" + result1[0] + ", " + result1[1] + "]");

            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = sol.twoSum(nums2, target2);
            System.out.println("Input: [3,2,4], Target: 6 -> Output: [" + result2[0] + ", " + result2[1] + "]");
        }
    }
    ```

2.  Abra seu terminal ou prompt de comando.

3.  Navegue até o diretório onde você salvou o arquivo `Main.java`.

4.  Execute o seguinte comando para compilar e executar o código em uma única linha:

    ```bash
    javac Main.java && java Main
    ```

    Este comando primeiro compila o arquivo `Main.java` (criando `Main.class` e `Solution.class`) e, se a compilação for bem-sucedida, executa o programa usando a classe `Main`.
-----

## Palindrome Number

Este repositório apresenta duas soluções para o problema "Palindrome Number" do LeetCode, utilizando abordagens e linguagens de programação diferentes. O objetivo é explorar como a natureza de cada linguagem pode influenciar a forma como um problema é resolvido, especialmente quando se trata de manipulação de números e strings. Uma solução tira proveito da facilidade de manipulação de strings em Python, enquanto a outra em Java utiliza operações aritméticas para demonstrar uma abordagem sem conversão para string.

-----

### Solução implementada em Python

A solução em Python adota uma abordagem direta e elegante, tirando proveito da flexibilidade da linguagem para manipulação de **strings**. Primeiro, verifica se o número `x` é negativo; se for, retorna `False` imediatamente, pois números negativos não podem ser palíndromos (o sinal `-` quebra a simetria). Em seguida, converte o número `x` para uma string. A parte central da solução é o fatiamento `[::-1]`, que cria uma versão invertida da string. Essa string invertida é então convertida de volta para um inteiro. Finalmente, compara-se o número original `x` com sua versão invertida. Se forem iguais, o número é um palíndromo.

**Como executar o código Python:**

1.  Salve o código acima em um arquivo chamado, por exemplo, `palindrome_python.py`.
2.  Para testar a solução, você pode adicionar algumas chamadas de teste ao final do arquivo:
    ```python
    # Adicione isso ao final do seu arquivo palindrome_python.py para testar
    if __name__ == "__main__":
        sol = Solution()
        print(f"121 é palíndromo? {sol.isPalindrome(121)}")    # Saída esperada: True
        print(f"-121 é palíndromo? {sol.isPalindrome(-121)}") # Saída esperada: False
        print(f"10 é palíndromo? {sol.isPalindrome(10)}")     # Saída esperada: False
        print(f"0 é palíndromo? {sol.isPalindrome(0)}")       # Saída esperada: True
    ```
3.  Abra seu terminal ou prompt de comando.
4.  Navegue até o diretório onde o arquivo `palindrome_python.py` está salvo.
5.  Execute o script com o comando:
    ```bash
    python palindrome_python.py
    ```

-----

### Solução implementada em Java

A solução em Java resolve o problema utilizando exclusivamente **operações aritméticas**, sem converter o número para uma string. Assim como na solução Python, ela primeiro verifica se o número é negativo, retornando `false` nesse caso. A lógica principal envolve construir o número reverso dígito por dígito. Isso é feito em um *loop* `while`: a cada iteração, o último dígito do `original_x` é extraído usando o operador de módulo (`% 10`). Esse dígito é então adicionado ao `reversed_x`, que é construído multiplicando-o por 10 e adicionando o novo dígito. Por fim, o `original_x` é reduzido dividindo-o por 10 (divisão inteira). O *loop* continua até que `original_x` se torne 0. Ao final, o número original é comparado com o `reversed_x` para determinar se é um palíndromo.

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima):

    ```java
    public class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();

            System.out.println("121 é palíndromo? " + sol.isPalindrome(121));    // Saída esperada: true
            System.out.println("-121 é palíndromo? " + sol.isPalindrome(-121)); // Saída esperada: false
            System.out.println("10 é palíndromo? " + sol.isPalindrome(10));     // Saída esperada: false
            System.out.println("0 é palíndromo? " + sol.isPalindrome(0));       // Saída esperada: true
        }
    }
    ```

2.  Abra seu terminal ou prompt de comando.

3.  Navegue até o diretório onde você salvou o arquivo `Main.java`.

4.  Execute o seguinte comando para compilar e executar o código em uma única linha:

    ```bash
    javac Main.java && java Main
    ```

    Este comando primeiro compila o arquivo `Main.java` (criando `Main.class` e `Solution.class`) e, se a compilação for bem-sucedida, executa o programa usando a classe `Main`.
-----

-----

## Roman to Integer

Este repositório apresenta duas soluções para o problema "Roman to Integer" do LeetCode, implementadas em Python e Java. A escolha de duas linguagens visa demonstrar a aplicação de uma mesma lógica algorítmica em diferentes ambientes de programação, ressaltando as semelhanças e pequenas diferenças sintáticas e de estrutura de dados (como dicionários/hash maps) em cada uma. Ambas as soluções utilizam uma abordagem eficiente que processa a string romana de trás para frente.

-----

### Solução implementada em Python

A solução em Python utiliza um **dicionário (hash map)** para mapear cada caractere romano ao seu valor inteiro correspondente. A lógica central da solução consiste em iterar pela string romana de **trás para frente**. Isso é crucial porque permite lidar facilmente com os casos em que um valor menor precede um valor maior (como 'IV' para 4 ou 'IX' para 9). A cada caractere, seu valor é obtido do dicionário. Se o valor atual for menor que o valor do caractere anterior (`prev`), ele é subtraído do total; caso contrário, é adicionado. O valor atual é então salvo como `prev` para a próxima iteração. Essa abordagem garante que os casos de subtração sejam tratados corretamente.

**Lógica:**

```
- Recebe a string
- Define curr = 0
- Define last = 0
- Define acc = 0
- Para cada elemento em string do último para o primeiro:
    - curr = elemento
    - se curr ≥ last:
        - acc = acc + curr
    - se curr < last;
        - acc = acc - curr
    - last = curr
- Retorna acc
```

**Como executar o código Python:**

1.  Salve o código acima em um arquivo chamado, por exemplo, `roman_to_int_python.py`.
2.  Para testar a solução, adicione algumas chamadas de teste ao final do arquivo:
    ```python
    # Adicione isso ao final do seu arquivo roman_to_int_python.py para testar
    if __name__ == "__main__":
        sol = Solution()
        print(f"Romano 'III' para Inteiro: {sol.romanToInt('III')}")   # Saída esperada: 3
        print(f"Romano 'LVIII' para Inteiro: {sol.romanToInt('LVIII')}") # Saída esperada: 58
        print(f"Romano 'MCMXCIV' para Inteiro: {sol.romanToInt('MCMXCIV')}") # Saída esperada: 1994
    ```
3.  Abra seu terminal ou prompt de comando.
4.  Navegue até o diretório onde o arquivo `roman_to_int_python.py` está salvo.
5.  Execute o script com o comando:
    ```bash
    python roman_to_int_python.py
    ```

-----

### Solução implementada em Java

A solução em Java segue a mesma lógica da versão em Python, utilizando um `HashMap` para armazenar os valores inteiros correspondentes a cada caractere romano. A iteração pela string é feita de **trás para frente** usando um *loop* `for` tradicional. Dentro do *loop*, o valor do caractere atual é obtido do `HashMap`. A mesma condição lógica é aplicada: se o valor atual for menor que o valor do caractere anterior (`previousValue`), ele é subtraído do total; caso contrário, é adicionado. O `previousValue` é então atualizado para o `currentValue` para a próxima iteração. Essa abordagem garante a correta conversão de números romanos, incluindo os casos de subtração.

**Lógica:**

```
- Recebe a string
- Define curr = 0
- Define last = 0
- Define acc = 0
- Para cada elemento em string do último para o primeiro:
    - curr = elemento
    - se curr ≥ last:
        - acc = acc + curr
    - se curr < last;
        - acc = acc - curr
    - last = curr
- Retorna acc
```

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution` e a importação do `HashMap`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima e o import):

    ```java
    import java.util.HashMap; // Importa a classe HashMap

    public class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();

            System.out.println("Romano 'III' para Inteiro: " + sol.romanToInt("III"));   // Saída esperada: 3
            System.out.println("Romano 'LVIII' para Inteiro: " + sol.romanToInt("LVIII")); // Saída esperada: 58
            System.out.println("Romano 'MCMXCIV' para Inteiro: " + sol.romanToInt("MCMXCIV")); // Saída esperada: 1994
        }
    }
    ```

2.  Abra seu terminal ou prompt de comando.

3.  Navegue até o diretório onde você salvou o arquivo `Main.java`.

4.  Execute o seguinte comando para compilar e executar o código em uma única linha:

    ```bash
    javac Main.java && java Main
    ```

    Este comando primeiro compila o arquivo `Main.java` e, se a compilação for bem-sucedida, executa o programa usando a classe `Main`.

-----

-----

## Add Two Numbers

Este repositório apresenta duas soluções para o problema "Add Two Numbers" do LeetCode, implementadas em Python e Java. O propósito de ter duas versões é demonstrar como a lógica para somar dois números representados por listas encadeadas (onde os dígitos estão em ordem reversa) pode ser adaptada e expressa em diferentes paradigmas de linguagem. Ambas as soluções utilizam a mesma abordagem fundamental de iteração dígito a dígito, gerenciando o "vai um" (carry), mas as nuances de cada linguagem (como a manipulação de nós de lista e a forma de lidar com referências nulas) são exploradas.

-----

### Solução implementada em Python

A solução em Python manipula as **listas encadeadas** simulando a soma manual de números. Ela cria um nó `result` inicial (um nó "dummy" ou cabeça fictícia) para simplificar a adição dos primeiros dígitos da soma, e um ponteiro `elem` que avança pela nova lista à medida que os dígitos são calculados. A iteração ocorre enquanto houver dígitos restantes em qualquer uma das listas de entrada (`l1` ou `l2`) ou enquanto houver um `carry` (vai um) da soma anterior. A cada passo, os valores dos nós atuais são somados junto com o `carry`. O novo `carry` é calculado usando divisão inteira (`// 10`), e o dígito a ser adicionado à nova lista é obtido com o operador de módulo (`% 10`). Os ponteiros `l1` e `l2` avançam para o próximo nó, se existirem. No final, o método retorna `result.next`, ignorando o nó "dummy" inicial.

**Como executar o código Python:**

Para executar este código, você precisará simular a estrutura `ListNode`. Aqui está um exemplo de como você pode fazer isso em um script Python:

1.  Salve o código acima (incluindo a definição da classe `ListNode`) em um arquivo chamado, por exemplo, `add_two_numbers_python.py`.
2.  Adicione o seguinte bloco de teste no final do arquivo para criar as listas de entrada e chamar a solução:
    ```python
    # Função auxiliar para criar ListNode a partir de uma lista Python
    def create_linked_list(arr):
        head = ListNode(0)
        current = head
        for val in arr:
            current.next = ListNode(val)
            current = current.next
        return head.next

    # Função auxiliar para converter ListNode para uma lista Python (para visualização)
    def linked_list_to_list(node):
        arr = []
        while node:
            arr.append(node.val)
            node = node.next
        return arr

    if __name__ == "__main__":
        sol = Solution()

        # Exemplo 1: 342 + 465 = 807
        l1_ex1 = create_linked_list([2, 4, 3])
        l2_ex1 = create_linked_list([5, 6, 4])
        result1 = sol.addTwoNumbers(l1_ex1, l2_ex1)
        print(f"Input: [2,4,3] + [5,6,4] -> Output: {linked_list_to_list(result1)}") # Saída esperada: [7, 0, 8]

        # Exemplo 2: 0 + 0 = 0
        l1_ex2 = create_linked_list([0])
        l2_ex2 = create_linked_list([0])
        result2 = sol.addTwoNumbers(l1_ex2, l2_ex2)
        print(f"Input: [0] + [0] -> Output: {linked_list_to_list(result2)}") # Saída esperada: [0]

        # Exemplo 3: 9999999 + 9999 = 10009998
        l1_ex3 = create_linked_list([9,9,9,9,9,9,9])
        l2_ex3 = create_linked_list([9,9,9,9])
        result3 = sol.addTwoNumbers(l1_ex3, l2_ex3)
        print(f"Input: [9,9,9,9,9,9,9] + [9,9,9,9] -> Output: {linked_list_to_list(result3)}") # Saída esperada: [8, 9, 9, 9, 0, 0, 0, 1]
    ```
3.  Abra seu terminal ou prompt de comando.
4.  Navegue até o diretório onde o arquivo `add_two_numbers_python.py` está salvo.
5.  Execute o script com o comando:
    ```bash
    python add_two_numbers_python.py
    ```
-----

### Solução implementada em Java

A solução em Java replica a lógica de soma de números representados por **listas encadeadas**, similar à abordagem manual. Ela inicializa um nó `result` (também um nó "dummy" ou cabeça fictícia) e um ponteiro `current` que será usado para construir a nova lista encadeada da soma. Um `carry` é mantido para gerenciar o "vai um" das somas de dígitos. O `while` loop continua enquanto houver nós a serem processados em `l1` ou `l2`, ou se ainda houver um `carry` remanescente. Dentro do loop, os valores dos nós atuais são somados (considerando 0 se o nó for `null`), e o `carry` é atualizado através de uma divisão inteira (`/ 10`). O dígito resultante para o nó atual é obtido pelo operador de módulo (`% 10`), e um novo `ListNode` é criado e anexado à lista resultante. Os ponteiros `l1` e `l2` avançam para o próximo nó, se existirem e não forem `null`. Ao final, `result.next` é retornado para descartar o nó "dummy".

**Como executar o código Java:**

Para executar este código Java, você precisará da definição da classe `ListNode` e de uma classe `Main` com o método `main` para testar.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código, que inclui a definição de `ListNode` e a classe `Solution` e a `Main`:

    ```java
    // Definição de ListNode
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public class Main {
        // Função auxiliar para criar ListNode a partir de um array de int
        public static ListNode createLinkedList(int[] arr) {
            ListNode head = new ListNode(0); // Dummy head
            ListNode current = head;
            for (int val : arr) {
                current.next = new ListNode(val);
                current = current.next;
            }
            return head.next;
        }

        // Função auxiliar para converter ListNode para String (para visualização)
        public static String linkedListToString(ListNode node) {
            StringBuilder sb = new StringBuilder("[");
            while (node != null) {
                sb.append(node.val);
                if (node.next != null) {
                    sb.append(", ");
                }
                node = node.next;
            }
            sb.append("]");
            return sb.toString();
        }

        public static void main(String[] args) {
            Solution sol = new Solution();

            // Exemplo 1: 342 + 465 = 807
            ListNode l1_ex1 = createLinkedList(new int[]{2, 4, 3});
            ListNode l2_ex1 = createLinkedList(new int[]{5, 6, 4});
            ListNode result1 = sol.addTwoNumbers(l1_ex1, l2_ex1);
            System.out.println("Input: [2,4,3] + [5,6,4] -> Output: " + linkedListToString(result1)); // Saída esperada: [7, 0, 8]

            // Exemplo 2: 0 + 0 = 0
            ListNode l1_ex2 = createLinkedList(new int[]{0});
            ListNode l2_ex2 = createLinkedList(new int[]{0});
            ListNode result2 = sol.addTwoNumbers(l1_ex2, l2_ex2);
            System.out.println("Input: [0] + [0] -> Output: " + linkedListToString(result2)); // Saída esperada: [0]

            // Exemplo 3: 9999999 + 9999 = 10009998
            ListNode l1_ex3 = createLinkedList(new int[]{9,9,9,9,9,9,9});
            ListNode l2_ex3 = createLinkedList(new int[]{9,9,9,9});
            ListNode result3 = sol.addTwoNumbers(l1_ex3, l2_ex3);
            System.out.println("Input: [9,9,9,9,9,9,9] + [9,9,9,9] -> Output: " + linkedListToString(result3)); // Saída esperada: [8, 9, 9, 9, 0, 0, 0, 1]
        }
    }
    ```

2.  Abra seu terminal ou prompt de comando.

3.  Navegue até o diretório onde você salvou o arquivo `Main.java`.

4.  Execute o seguinte comando para compilar e executar o código em uma única linha:

    ```bash
    javac Main.java && java Main
    ```

    Este comando primeiro compila o arquivo `Main.java` (criando `Main.class` e `Solution.class`, além de `ListNode.class`) e, se a compilação for bem-sucedida, executa o programa usando a classe `Main`.

-----