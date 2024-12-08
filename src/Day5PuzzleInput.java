public class Day5PuzzleInput {

    String input;

    Day5PuzzleInput(String size) {
        if (size.equals("small")) {
            input = smallInput();
        } else if (size.equals("mini")) {
            input = miniInput();
        } else {
            input = bigInput();
        }
    }


private String miniInput() {
    return """
            10|20
            10|30
            10|40
            10|50
            20|40
            20|30
            20|50
            30|40
            30|50
            40|50
            
            10,40,20,30,50
            10,15,20,30,50
            05,20,10,30,50
            """;
}

private String smallInput() {
    return """
            47|53
            97|13
            97|61
            97|47
            75|29
            61|13
            75|53
            29|13
            97|29
            53|29
            61|53
            97|53
            61|29
            47|13
            75|47
            97|75
            47|61
            75|61
            47|29
            75|13
            53|13
            
            75,47,61,53,29
            97,61,53,29,13
            75,29,13
            75,97,47,61,53
            61,13,29
            97,13,75,29,47
            """;
}

private String bigInput() {
    return """
            32|75
            18|19
            18|82
            41|56
            41|28
            41|47
            85|67
            85|66
            85|35
            85|93
            87|31
            87|38
            87|44
            87|94
            87|55
            66|96
            66|39
            66|94
            66|95
            66|29
            66|36
            16|14
            16|74
            16|47
            16|17
            16|18
            16|28
            16|93
            31|77
            31|19
            31|34
            31|29
            31|52
            31|66
            31|39
            31|75
            62|89
            62|18
            62|63
            62|85
            62|76
            62|37
            62|93
            62|68
            62|14
            46|44
            46|66
            46|75
            46|67
            46|87
            46|31
            46|19
            46|18
            46|63
            46|15
            74|27
            74|67
            74|84
            74|66
            74|63
            74|29
            74|34
            74|18
            74|44
            74|28
            74|46
            56|67
            56|68
            56|47
            56|59
            56|18
            56|87
            56|46
            56|27
            56|32
            56|43
            56|28
            56|13
            68|89
            68|66
            68|52
            68|28
            68|98
            68|36
            68|84
            68|19
            68|34
            68|27
            68|44
            68|95
            68|13
            28|94
            28|63
            28|31
            28|66
            28|87
            28|29
            28|34
            28|15
            28|98
            28|13
            28|75
            28|95
            28|18
            28|44
            13|98
            13|21
            13|75
            13|77
            13|62
            13|38
            13|34
            13|83
            13|84
            13|29
            13|96
            13|86
            13|19
            13|44
            13|76
            55|38
            55|14
            55|35
            55|96
            55|74
            55|62
            55|76
            55|17
            55|82
            55|59
            55|56
            55|21
            55|46
            55|93
            55|43
            55|85
            96|56
            96|68
            96|35
            96|74
            96|16
            96|62
            96|59
            96|87
            96|47
            96|86
            96|85
            96|14
            96|37
            96|28
            96|46
            96|67
            96|93
            93|75
            93|29
            93|74
            93|32
            93|98
            93|67
            93|52
            93|66
            93|15
            93|46
            93|31
            93|87
            93|34
            93|18
            93|77
            93|68
            93|13
            93|89
            89|77
            89|82
            89|55
            89|38
            89|34
            89|75
            89|95
            89|19
            89|98
            89|52
            89|29
            89|94
            89|84
            89|13
            89|83
            89|41
            89|66
            89|27
            89|36
            98|59
            98|96
            98|56
            98|85
            98|77
            98|34
            98|62
            98|38
            98|21
            98|84
            98|39
            98|17
            98|94
            98|86
            98|95
            98|83
            98|36
            98|44
            98|82
            98|19
            37|28
            37|87
            37|14
            37|74
            37|75
            37|29
            37|63
            37|31
            37|32
            37|93
            37|46
            37|15
            37|27
            37|95
            37|18
            37|68
            37|67
            37|13
            37|43
            37|98
            37|52
            34|35
            34|41
            34|43
            34|85
            34|94
            34|84
            34|59
            34|56
            34|37
            34|96
            34|86
            34|14
            34|38
            34|17
            34|82
            34|21
            34|76
            34|47
            34|39
            34|55
            34|83
            34|16
            38|47
            38|96
            38|17
            38|46
            38|32
            38|16
            38|39
            38|37
            38|56
            38|18
            38|86
            38|76
            38|43
            38|68
            38|21
            38|93
            38|59
            38|67
            38|74
            38|85
            38|35
            38|14
            38|28
            35|18
            35|28
            35|29
            35|89
            35|63
            35|74
            35|43
            35|93
            35|98
            35|52
            35|37
            35|87
            35|14
            35|68
            35|46
            35|27
            35|13
            35|67
            35|95
            35|66
            35|15
            35|31
            35|75
            35|32
            44|94
            44|17
            44|76
            44|41
            44|16
            44|85
            44|36
            44|38
            44|47
            44|59
            44|37
            44|39
            44|77
            44|35
            44|86
            44|55
            44|83
            44|84
            44|96
            44|21
            44|34
            44|82
            44|62
            44|56
            67|77
            67|75
            67|94
            67|19
            67|32
            67|15
            67|66
            67|36
            67|18
            67|31
            67|52
            67|44
            67|27
            67|84
            67|89
            67|28
            67|13
            67|29
            67|63
            67|34
            67|98
            67|87
            67|68
            67|95
            29|34
            29|21
            29|16
            29|56
            29|41
            29|84
            29|38
            29|76
            29|17
            29|62
            29|82
            29|19
            29|96
            29|36
            29|83
            29|55
            29|98
            29|85
            29|94
            29|95
            29|86
            29|77
            29|39
            29|44
            14|13
            14|29
            14|74
            14|31
            14|75
            14|18
            14|89
            14|15
            14|52
            14|67
            14|98
            14|66
            14|95
            14|93
            14|87
            14|28
            14|27
            14|32
            14|44
            14|68
            14|19
            14|63
            14|43
            14|46
            59|28
            59|29
            59|46
            59|52
            59|68
            59|15
            59|32
            59|18
            59|87
            59|37
            59|67
            59|13
            59|47
            59|63
            59|93
            59|75
            59|66
            59|35
            59|43
            59|31
            59|89
            59|74
            59|27
            59|14
            82|85
            82|14
            82|93
            82|56
            82|37
            82|59
            82|62
            82|35
            82|28
            82|43
            82|41
            82|76
            82|47
            82|96
            82|68
            82|46
            82|74
            82|16
            82|17
            82|67
            82|86
            82|21
            82|38
            82|39
            17|89
            17|15
            17|13
            17|59
            17|68
            17|43
            17|63
            17|52
            17|28
            17|74
            17|32
            17|27
            17|14
            17|18
            17|67
            17|37
            17|31
            17|93
            17|87
            17|47
            17|85
            17|56
            17|46
            17|35
            19|41
            19|38
            19|84
            19|39
            19|44
            19|76
            19|83
            19|94
            19|96
            19|16
            19|17
            19|82
            19|34
            19|21
            19|36
            19|55
            19|62
            19|47
            19|35
            19|59
            19|56
            19|77
            19|86
            19|85
            77|34
            77|96
            77|94
            77|62
            77|16
            77|47
            77|84
            77|85
            77|35
            77|86
            77|17
            77|36
            77|56
            77|83
            77|14
            77|76
            77|37
            77|38
            77|55
            77|21
            77|41
            77|82
            77|59
            77|39
            43|87
            43|46
            43|27
            43|93
            43|18
            43|66
            43|52
            43|77
            43|44
            43|19
            43|13
            43|29
            43|15
            43|89
            43|31
            43|67
            43|74
            43|63
            43|75
            43|95
            43|32
            43|28
            43|98
            43|68
            15|95
            15|31
            15|84
            15|19
            15|82
            15|27
            15|21
            15|38
            15|98
            15|75
            15|52
            15|55
            15|66
            15|13
            15|34
            15|29
            15|39
            15|94
            15|77
            15|36
            15|89
            15|41
            15|83
            15|44
            76|46
            76|17
            76|27
            76|43
            76|89
            76|74
            76|35
            76|28
            76|68
            76|67
            76|56
            76|52
            76|15
            76|87
            76|85
            76|59
            76|37
            76|31
            76|18
            76|47
            76|32
            76|93
            76|63
            76|14
            95|59
            95|82
            95|47
            95|17
            95|34
            95|94
            95|77
            95|55
            95|86
            95|84
            95|21
            95|96
            95|39
            95|83
            95|44
            95|56
            95|41
            95|36
            95|19
            95|38
            95|76
            95|62
            95|16
            95|85
            83|76
            83|96
            83|14
            83|56
            83|68
            83|16
            83|93
            83|46
            83|17
            83|37
            83|59
            83|86
            83|62
            83|82
            83|74
            83|85
            83|21
            83|35
            83|47
            83|38
            83|43
            83|67
            83|39
            83|41
            75|34
            75|84
            75|82
            75|36
            75|98
            75|19
            75|83
            75|17
            75|44
            75|55
            75|76
            75|39
            75|77
            75|66
            75|62
            75|21
            75|94
            75|86
            75|41
            75|96
            75|29
            75|16
            75|95
            75|38
            52|29
            52|66
            52|83
            52|19
            52|84
            52|95
            52|13
            52|98
            52|16
            52|77
            52|75
            52|41
            52|96
            52|39
            52|21
            52|82
            52|36
            52|86
            52|94
            52|38
            52|62
            52|44
            52|55
            52|34
            21|59
            21|76
            21|18
            21|86
            21|39
            21|46
            21|37
            21|16
            21|62
            21|96
            21|14
            21|35
            21|56
            21|68
            21|43
            21|67
            21|32
            21|47
            21|17
            21|85
            21|74
            21|93
            21|87
            21|28
            84|83
            84|85
            84|41
            84|14
            84|62
            84|59
            84|16
            84|93
            84|39
            84|38
            84|36
            84|55
            84|43
            84|86
            84|17
            84|47
            84|82
            84|21
            84|56
            84|94
            84|96
            84|76
            84|35
            84|37
            47|68
            47|35
            47|74
            47|67
            47|89
            47|31
            47|63
            47|27
            47|52
            47|87
            47|15
            47|28
            47|14
            47|66
            47|46
            47|32
            47|29
            47|37
            47|98
            47|43
            47|13
            47|75
            47|93
            47|18
            39|43
            39|56
            39|32
            39|14
            39|96
            39|85
            39|93
            39|74
            39|28
            39|18
            39|17
            39|86
            39|47
            39|16
            39|46
            39|59
            39|62
            39|35
            39|63
            39|67
            39|68
            39|87
            39|76
            39|37
            27|29
            27|21
            27|77
            27|94
            27|66
            27|39
            27|82
            27|86
            27|13
            27|31
            27|75
            27|41
            27|19
            27|98
            27|34
            27|36
            27|84
            27|44
            27|55
            27|83
            27|96
            27|52
            27|95
            27|38
            36|74
            36|59
            36|55
            36|86
            36|43
            36|93
            36|38
            36|16
            36|85
            36|37
            36|96
            36|39
            36|56
            36|14
            36|17
            36|46
            36|83
            36|82
            36|21
            36|35
            36|47
            36|41
            36|62
            36|76
            94|56
            94|86
            94|85
            94|17
            94|37
            94|36
            94|59
            94|74
            94|93
            94|39
            94|38
            94|76
            94|55
            94|82
            94|62
            94|21
            94|83
            94|47
            94|43
            94|41
            94|16
            94|35
            94|96
            94|14
            86|85
            86|74
            86|47
            86|32
            86|16
            86|28
            86|35
            86|46
            86|14
            86|56
            86|15
            86|76
            86|63
            86|93
            86|59
            86|89
            86|87
            86|17
            86|37
            86|43
            86|67
            86|18
            86|68
            86|62
            63|15
            63|77
            63|38
            63|44
            63|19
            63|27
            63|83
            63|41
            63|21
            63|82
            63|34
            63|94
            63|95
            63|36
            63|89
            63|31
            63|52
            63|84
            63|13
            63|75
            63|98
            63|29
            63|55
            63|66
            32|98
            32|29
            32|41
            32|34
            32|36
            32|82
            32|44
            32|63
            32|27
            32|55
            32|83
            32|95
            32|19
            32|77
            32|52
            32|66
            32|15
            32|94
            32|89
            32|84
            32|13
            32|87
            32|31
            18|55
            18|29
            18|77
            18|34
            18|27
            18|52
            18|94
            18|89
            18|95
            18|13
            18|15
            18|63
            18|66
            18|36
            18|98
            18|87
            18|84
            18|75
            18|44
            18|31
            18|32
            18|83
            41|86
            41|59
            41|38
            41|85
            41|18
            41|74
            41|46
            41|17
            41|96
            41|62
            41|93
            41|67
            41|76
            41|14
            41|43
            41|37
            41|39
            41|35
            41|21
            41|68
            41|16
            85|68
            85|37
            85|43
            85|27
            85|13
            85|89
            85|75
            85|46
            85|52
            85|59
            85|31
            85|87
            85|32
            85|15
            85|18
            85|14
            85|28
            85|74
            85|63
            85|47
            87|15
            87|41
            87|13
            87|52
            87|36
            87|29
            87|95
            87|34
            87|27
            87|63
            87|77
            87|89
            87|19
            87|83
            87|84
            87|75
            87|98
            87|82
            87|66
            66|62
            66|38
            66|98
            66|82
            66|16
            66|84
            66|44
            66|41
            66|76
            66|77
            66|86
            66|83
            66|21
            66|55
            66|56
            66|19
            66|34
            66|17
            16|63
            16|76
            16|59
            16|56
            16|15
            16|85
            16|89
            16|35
            16|27
            16|67
            16|32
            16|43
            16|62
            16|87
            16|68
            16|46
            16|37
            31|98
            31|96
            31|95
            31|41
            31|16
            31|82
            31|84
            31|21
            31|83
            31|44
            31|13
            31|38
            31|36
            31|55
            31|86
            31|94
            62|43
            62|56
            62|17
            62|67
            62|32
            62|87
            62|46
            62|59
            62|27
            62|74
            62|31
            62|47
            62|35
            62|15
            62|28
            46|28
            46|95
            46|32
            46|77
            46|29
            46|13
            46|89
            46|34
            46|27
            46|52
            46|94
            46|68
            46|84
            46|98
            74|31
            74|95
            74|89
            74|68
            74|98
            74|19
            74|32
            74|15
            74|77
            74|75
            74|13
            74|87
            74|52
            56|93
            56|85
            56|75
            56|63
            56|35
            56|37
            56|89
            56|52
            56|15
            56|14
            56|31
            56|74
            68|75
            68|31
            68|94
            68|29
            68|18
            68|77
            68|15
            68|63
            68|55
            68|87
            68|32
            28|36
            28|83
            28|52
            28|27
            28|19
            28|55
            28|32
            28|84
            28|89
            28|77
            13|95
            13|55
            13|66
            13|94
            13|39
            13|36
            13|16
            13|82
            13|41
            55|37
            55|83
            55|47
            55|39
            55|16
            55|67
            55|86
            55|41
            96|18
            96|76
            96|32
            96|17
            96|15
            96|63
            96|43
            93|27
            93|28
            93|95
            93|63
            93|19
            93|44
            89|21
            89|96
            89|44
            89|31
            89|39
            98|16
            98|55
            98|76
            98|41
            37|19
            37|66
            37|89
            34|36
            34|62
            38|62
            
            52,77,83,31,94,75,34,95,29,38,82,19,41,39,27,98,84,13,55,21,66
            76,17,43,93,46,67,68,28,18,32,87,15,89,27,31
            28,63,89,27,13,66,98,95,19,36,55
            38,21,39,86,16,62,76,85,47,35,93,67,68,28,18
            46,67,68,28,18,87,15,89,27,31,52,13,75,66,29,98,95,19,44,77,84
            41,34,98,29,95,96,55,86,52,13,16,38,82
            55,83,21,16,62,76,56,43,46
            37,14,56,17,18,16,35,67,21,38,59,85,93
            63,18,55,27,98,32,84,19,89,87,52,44,31,95,77,36,66,13,28,29,15,94,75
            55,76,39,16,82,19,34,66,29,96,75
            77,34,84,94,36,55,83,82,41,38,21,39,96,86,16,62,76,56,85,59,47,35,37
            62,17,47,39,37,86,85,74,38,14,93,16,67
            37,67,56,46,85,62,43,68,96,17,86,39,14,76,41,82,16
            89,44,67,98,28,13,75,31,63,87,52,84,34,68,77,32,46
            41,38,39,96,62,17,56,47,35,37,93
            44,84,94,36,21,16,62,76,85,47,35
            34,13,32,83,18,89,94,31,84,27,29,95,19,75,55,63,44,52,66,98,77
            75,68,67,89,74,15,28,63,44,98,29,93,52,18,95,43,13
            84,83,41,16,62,17,85,47,35,14,43
            66,75,29,39,36,82,19,13,95,44,84,96,38,16,34,52,55,86,98,83,21
            38,39,37,93,17,59,68,82,85,46,47,16,67,86,62,14,35
            75,34,27,98,89,28,84,63,36,32,87,55,31
            43,93,74,46,67,68,28,87,63,15,89,31,52,13,75,66,29,98,95,19,44
            28,87,63,15,31,52,13,29,95,19,34,84,94
            32,87,63,15,89,31,13,75,66,95,19,77,34,94,36,83,82
            55,21,17,56,83,98,76,62,39,38,19,29,44,41,84,34,95,86,16
            17,56,59,35,14,93,74,46,67,27,52
            89,27,52,19,77,34,94,21,39
            85,14,74,46,68,28,18,32,87,63,15,27,52,13,75
            83,82,41,38,21,39,96,86,16,62,76,17,56,85,59,47,35,37,14,43,93,74,67
            85,14,74,46,68,32,87,15,31,52,75
            95,27,19,77,98,31,84,94,15,63,34,75,55,83,52,87,13
            13,66,19,77,34,84,55,86,62
            34,84,87,19,13,83,31,29,44,95,15,77,55,36,52,27,66,98,75,89,41
            16,62,76,56,47,37,43,93,87,63,89
            15,13,75,66,34,84,36,83,82,38,21
            14,27,46,18,75,59,63,47,85,67,68,37,43
            63,15,89,27,31,13,66,98,95,19,38
            18,32,63,15,27,31,52,13,75,98,95,19,44,77,34,84,36,55,83
            44,75,27,63,98,18,34,66,68,31,19,95,52,32,28,87,29
            19,44,77,34,84,94,36,55,83,82,41,38,21,96,86,16,62,76,17,56,85,59,47
            67,63,18,93,37,46,17,87,89,43,52,56,35
            98,18,29,89,31
            52,13,66,98,95,19,34,84,94,55,82,41,39,86,16
            67,28,87,75,66,29,19,77,34,84,94
            31,13,55,41,98,38,15,83,27,95,29,89,84,77,21,34,75
            18,31,13,75,95
            27,14,87,63,18,32,29,67,31,89,15,37,13,43,74,47,68,28,35
            93,96,82,41,94,16,17
            17,56,85,37,43,93,74,67,68,28,18,32,63,15,89,31,52
            96,16,76,17,85,59,47,37,46,68,18,87,63
            17,16,77,59,95,44,34
            77,44,75,68,32,29,67,74,15,52,46,87,13,31,34,63,28,66,95,98,27
            68,63,15,13,66,19,84,94,36
            13,75,66,29,98,95,19,44,77,34,84,94,36,55,83,41,38,21,39,96,86,16,62
            15,27,52,13,29,19,44,77,94,36,55,83,41
            43,93,67,68,28,18,32,87,63,15,89,27,52,13,75,66,98,19,44
            55,83,38,39,86,16,76,14,93
            29,84,87,27,34,94,18,55,13,63,77,98,89,66,95
            41,21,96,59,35,46,28
            83,82,41,38,21,39,96,86,62,76,17,56,85,59,47,35,14,43,67
            82,94,39,76,98,75,86
            14,43,74,46,68,18,32,63,15,89,13,75,66,98,95
            94,39,82,41,75,55,98,89,27,66,19,34,21,84,95,77,29
            85,59,35,37,43,93,74,46,67,68,28,18,32,87,15,89,27,31,52,13,75
            59,47,35,37,14,43,93,74,46,67,68,28,18,32,87,63,15,89,27,31,52,13,66
            16,76,17,56,47,35,14,93,74,46,68,18,63,15,89
            39,96,16,62,76,56,85,59,47,35,14,93,67,28,18,32,87
            56,85,59,47,35,37,14,43,93,74,46,67,68,28,18,32,87,63,15,89,27,52,13
            36,82,38,39,62,37,74
            66,59,75,63,15,35,74,28,67,93,37,27,18
            66,84,41,36,87,44,31
            15,77,34,44,67,32,66,29,18,68,13,28,31,27,19,63,89,95,84,94,98
            68,35,86,46,14,93,85,37,96
            27,31,52,75,66,29,98,95,19,77,84,36,55,82,41,38,96
            98,38,85,55,76,84,44,83,95,36,96,82,86,34,17
            55,89,66,29,63,77,87,75,84,31,94,19,34,36,52,32,95,98,27,18,44
            66,29,98,95,19,44,77,94,36,38,96,86,16,76,17
            16,46,85,17,59,74,18,39,47,37,67,93,76,56,32,96,14,28,62
            34,86,59,83,56,94,76,84,17,55,36,77,35,39,38,96,16
            34,84,36,98,95,39,44,66,75,76,55
            41,56,21,82,86,16,47,59,19
            59,47,35,37,14,93,74,46,67,68,28,18,32,87,63,15,89,27,31,52,13,75,66
            41,39,38,13,82,34,83,98,31,95,55,19,86
            29,52,84,31,98,95,77,63,94,83,15,66,38,19,41,55,89
            86,16,62,56,85,47,35,37,14,46,68,87,15
            35,93,37,89,15,46,29,13,18,75,68,14,66,87,52,27,67,74,31,43,32,28,47
            13,82,94,75,55,19,63,66,77,34,98,41,31,95,89,44,87
            41,38,21,39,96,86,16,62,76,17,56,85,59,47,35,37,14,43,74,46,67,68,28
            14,43,93,74,46,67,68,28,18,32,87,63,15,89,27,52,13,75,66,29,98,95,19
            21,39,86,76,17,56,59,37,43,46,28
            67,32,63,93,37,31,29,18,74,15,66,47,52,43,13,75,89
            56,85,59,47,35,37,14,43,93,74,46,68,18,32,87,63,15,89,27,31,52
            87,18,75,27,63,28,19,67,29,43,74,95,31,98,52
            85,38,56,84,98,86,95,34,62,36,16,44,77
            37,67,87,63,27,52,75,98,95
            37,62,21,86,84,83,82,14,47,55,59,34,96,35,36
            96,86,16,62,76,56,85,59,47,35,37,14,43,74,46,67,28,18,32,87,63
            75,66,29,19,94,55,83,82,38,21,16,62,76
            35,43,74,75,66,29,98
            85,47,35,17,28,87,32,59,76,37,39,56,93
            18,14,68,67,63,62,27,32,89,43,46,28,15,93,87
            77,34,94,55,83,82,41,38,21,39,86,16,76,17,59,35,37
            74,21,18,43,14,96,32,62,67,56,59,76,85,39,46
            34,94,36,82,41,38,76,17,85,35,14
            66,86,21,36,84,82,44,34,55,83,52,13,94,75,29,98,16,19,39,77,96,38,41
            16,34,86,76,59,41,39,94,21,47,83,84,62,38,82,36,96,17,56,55,35,77,85
            86,62,76,56,85,59,47,35,37,43,93,74,67,32,15
            35,14,43,93,74,46,67,68,28,18,32,87,63,15,89,27,31,52,13,75,66,29,98
            85,27,59,47,67,35,37,15,62,56,46,89,76
            37,14,43,93,74,46,67,68,28,32,63,31,52,13,75,66,29,98,95
            77,27,83,98,32,31,18,63,19,66,94,55,29,36,34
            77,84,94,55,83,38,76,17,56,59,47,35,37
            44,87,32,13,98,28,94,66,52,89,77,67,75,95,34
            59,35,37,14,93,46,18,32,87,15,89,27,31,52,13,75,66
            41,47,28,74,17,68,43
            93,74,46,67,68,28,18,32,87,15,89,27,31,52,13,75,66,29,98,95,19,44,77
            85,59,35,68,28,18,89,31,75
            32,87,15,89,44,84,94,36,83
            84,34,29,41,94,66,75,27,38,63,52
            98,19,77,34,84,36,55,41,21,39,96,86,16,62,76,56,85
            27,52,75,66,19,44,77,34,94,55,82,38,39
            62,76,17,85,59,47,35,37,14,43,93,74,67,68,28,63,27
            82,39,16,62,17,59,47,14,46
            89,27,52,13,75,66,98,95,19,44,77,34,84,94,36,55,41,38,21
            17,74,46,15,56,43,37,32,14,68,76,31,47
            63,38,27,31,44,98,55
            21,41,39,59,86,82,36,94,55,38,47,93,17,14,85,43,16,76,37
            75,98,95,44,77,55,38,16,76
            39,96,16,62,76,56,59,37,43,93,74,67,28,18,87
            86,77,59,94,76,83,44,96,39,35,85
            55,83,96,59,93,74,46
            86,17,93,67,28
            29,98,19,44,77,34,84,94,36,55,83,39,86,16,62,76,56
            31,52,75,66,95,77,34,84,36,83,21,39,86
            46,67,68,85,15,18,17,59,63,28,56,87,31
            89,27,31,52,75,29,19,44,34,36,82,38,21
            31,52,67,19,87,29,44,77,63,28,94
            62,16,41,14,17,86,35,59,21
            44,86,21,34,59,94,85,96,76,35,41
            21,95,75,15,19,77,66,94,36,13,52,82,98,44,29,31,84,38,83,27,41
            38,39,96,16,62,56,85,59,35,37,14,74,46,67,68,28,18
            55,21,96,86,37,14,46
            98,63,27,44,15
            39,96,86,62,76,56,85,35,37,74,46,67,68,18,87
            83,59,37,38,82
            98,19,34,83,82
            39,19,59,84,47,77,16,34,56,44,83
            56,47,83,62,55,44,21,59,35,76,39,16,86,17,82,77,41,36,38,96,34
            14,28,18,32,27,31,29
            83,21,89,52,39,34,41,77,31,44,29,55,84,38,98
            68,31,13,98,44,84,36
            34,84,82,86,76
            29,32,19,63,66,44,89,52,46,98,77,18,75,67,84,13,95,27,68,15,28
            63,89,27,31,75,29,98,19,84,94,36,55,83,82,41
            35,86,67,28,37,76,93,63,68,59,18,47,32,96,17,43,16,14,85,62,56
            29,52,55,19,13,15,89,83,31,77,75,63,82
            77,34,36,55,83,82,41,96,16,62,56,85,37
            35,59,86,37,74,47,62,46,38,76,14,83,39,43,82,41,55,16,17,93,96
            56,59,47,37,74,18,32,89,27,52,13
            31,93,89,63,35,15,52,87,74,68,32,98,67,37,28,18,46,14,75
            74,47,15,43,63,35,86,62,67,56,93,68,46,16,32,87,17,37,18,59,14,28,76
            93,74,63,89,31
            47,35,37,14,43,93,74,46,67,68,28,32,87,63,15,89,27,31,52,13,75,66,29
            68,63,15,31,98,95,19,44,77
            93,46,68,28,18,87,63,15,89,31,52,13,66,29,95
            77,85,95,21,94,39,41,86,98,17,34,56,83,84,82
            63,87,14,46,43,47,56,13,67
            62,76,17,43,93,74,68,63,27
            85,47,43,93,74,68,63,15,89,27,52,13,75
            17,35,37,14,93,46,68,87,15,27,52
            27,34,77,98,19,32,75,89,13,18,28,74,68,46,95,52,44,67,29
            95,13,66,27,84,44,36,89,63,55,28
            41,38,21,39,96,86,16,62,76,56,85,59,47,35,37,14,43,93,46,67,28
            52,13,75,66,29,98,95,19,44,77,34,84,94,55,83,82,41,38,21,39,96,86,16
            86,56,35,59,83,37,82,55,96
            89,47,63,18,74,62,28,43,59,27,14,76,67,15,93,68,85
            86,87,67,43,47,39,14
            18,55,89,77,19,13,66,29,28,32,52,27,94,95,44,15,36,87,34,31,84
            35,37,14,43,93,74,46,67,68,28,18,32,63,15,89,27,31,52,13,75,66,29,98
            77,34,84,36,41,38,39,96,86,76,56,85,59
            31,66,84,94,82,21,86
            93,32,87,52,75,66,29,19,77
            74,46,27,18,37,28,14,87,93,66,35,67,52,15,29,75,98
            98,66,29,75,15,68,27,67,31,13,63,93,89,46,52,87,95,18,32,19,44,74,43
            """;
}


}
