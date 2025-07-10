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
