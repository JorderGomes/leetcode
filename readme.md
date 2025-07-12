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

**Código:**

```python
class Solution(object):
    def twoSum(self, nums, target):
        hash_map = {}
        for index, num in enumerate(nums):
            complement = target - num
            if complement in hash_map:
                return [hash_map[complement], index]
            else:
                hash_map[num] = index
```

**Como executar o código Python:**

1.  Salve o código acima em um arquivo chamado, por exemplo, `solution_python.py`.
2.  Para testar, você pode adicionar algumas chamadas de teste ao final do arquivo, ou simplesmente copiar a classe para um ambiente de execução LeetCode ou um *notebook* Python.
    Exemplo de uso em um script:
    ```python
    # Adicione isso ao final do seu arquivo solution_python.py para testar
    if __name__ == "__main__":
        sol = Solution()
        nums1 = [2, 7, 11, 15]
        target1 = 9
        print(f"Input: {nums1}, Target: {target1} -> Output: {sol.twoSum(nums1, target1)}") # Saída esperada: [0, 1]

        nums2 = [3, 2, 4]
        target2 = 6
        print(f"Input: {nums2}, Target: {target2} -> Output: {sol.twoSum(nums2, target2)}") # Saída esperada: [1, 2]
    ```
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

**Código:**

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
```

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima):

    ```java
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{0, 0};
        }
    }

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

**Código:**

```python
class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        reversed_x = int(str(x)[::-1])
        return x == reversed_x
```

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

**Código:**

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed_x = 0;
        int original_x = x;
        while (original_x > 0) {
            int digit = original_x % 10;
            reversed_x = reversed_x * 10 + digit;
            original_x /= 10;
        }
        return x == reversed_x;
    }
}
```

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima):

    ```java
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            int reversed_x = 0;
            int original_x = x;
            while (original_x > 0) {
                int digit = original_x % 10;
                reversed_x = reversed_x * 10 + digit;
                original_x /= 10;
            }
            return x == reversed_x;
        }
    }

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

**Código:**

```python
class Solution(object):
    def romanToInt(self, s):
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        curr = 0
        prev = 0
        total = 0
        for char in s[::-1]: # Itera de trás para frente
            curr = roman_to_int[char]
            if curr < prev:
                total -= curr
            else:
                total += curr
            prev = curr
        return total
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

**Código:**

```java
import java.util.HashMap; // Import necessário para usar HashMap

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        int currentValue = 0;
        int previousValue = 0;
        int total = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) { // Itera de trás para frente
            char currentChar = s.charAt(i);
            currentValue = romanToIntMap.get(currentChar);
            if (currentValue < previousValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            previousValue = currentValue;
        }
        return total;
    }
}
```

**Como executar o código Java:**

Para executar este código Java, você precisará de uma classe com o método `main` para testar a `Solution` e a importação do `HashMap`.

1.  Crie um arquivo chamado `Main.java` e cole o seguinte código (incluindo a classe `Solution` acima e o import):

    ```java
    import java.util.HashMap; // Importa a classe HashMap

    class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> romanToIntMap = new HashMap<>();
            romanToIntMap.put('I', 1);
            romanToIntMap.put('V', 5);
            romanToIntMap.put('X', 10);
            romanToIntMap.put('L', 50);
            romanToIntMap.put('C', 100);
            romanToIntMap.put('D', 500);
            romanToIntMap.put('M', 1000);
            
            int currentValue = 0;
            int previousValue = 0;
            int total = 0;
            
            for (int i = s.length() - 1; i >= 0; i--) {
                char currentChar = s.charAt(i);
                currentValue = romanToIntMap.get(currentChar);
                if (currentValue < previousValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
                previousValue = currentValue;
            }
            return total;
        }
    }

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