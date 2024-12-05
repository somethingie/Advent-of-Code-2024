public class Day4PuzzleInput {

    String input;
    Day4PuzzleInput(String size) {
        if (size.equals("small")){
            input = smallInput();
        } else if (size.equals("mini")) {
            input = miniImput();
        }else {
            input = bigInput();
        }
    }

    public String miniImput() {
        return """
                ..X...
                .SAMX.
                .A..A.
                XMAS.S
                .X....
                """;
    }

    public String smallInput() {
        return """
                .M.S......
                ..A..MSMS.
                .M.S.MAA..
                ..A.ASMSM.
                .M.S.M....
                ..........
                S.S.S.S.S.
                .A.A.A.A..
                M.M.M.M.M.
                ..........
                """;
    }

    public String bigInput() {
        return """
                XMXXMSSSMSXSXMMXSAMMXXSXMASMSSXXMAMXAMXSXMXSMAMMASXXASMMXMASXMSSXMMMXMXSXXSXMXXSAMXSXSXSAMXMSAMXMAXXXMXMAMSASXMSSXMSXSXXMAXXSSSMXMXMXMMAASXM
                MSSMMAAXAMMSAAAXXAMSXMAMXMSMAMMXSAXMXMASAMASMAMMASXMAMAXXXMASAAAXMSMSMAMAMMAMAMMMMXMASMMXMXAMASXMAMMMMASMMSMMMMASAAXAAMMMMSMXAAMSAMSASMMMMAX
                AAAXMMXMSMASXMMSMXMMASMAAMXMASAMMAXSAMASAMASXXSMASASMSMMMMASMMMMMMAAXMXSAMSAMASMASAMAMASMMMMSAMXMAXAASASAAXAAXMASMMMSMXAAXAAMSMMMAXMAXMAASMM
                SSMMXSAAXMMSAXMAXAAXAMXXMSSSMSMAMAMXAMXXXMXSXMMMMSAMXAXXAMXAXXMAXMASMXASAXXMSAXXASAMAXAMXXAXMXXMSASXMMASMMSSMSMMSASAMXSSSSMSAAAXMMMMXMMSXSXA
                XAAAAMMSMSXXMXAASXSMSMSMXXMAMXMASXSSMMXMAMAMMMAAMMAMMMXSSMSAMXSMSASMXXMSXMAAMAMMMSXMAMMSXSASASAMXASXAMAXMAAAAXXMSXMXMXMXMAXAMXSAXAAXAXAXAMXS
                SXMMSXAXASXAMMMMSXMXMASXMMXMMSMAXXMAMAMXAMASASMSMXAMXMMAMASAMXSXMMXAXSXSAMXMMAMAAMXMASMAXAAMAMSMMXMMMMMSMMMSAMXAXMMMSXSASMMMSMMMSSSMMMMMAMSM
                AAXAXMSMAMSMMAAMSMSAMMMAMAASASMASMSAMAMMASASASXMASMSMSAAMAMAMAMASXMMMAASXMAXSASMMXAXAMMMMMSMXMAXSASASAMXXSMMMSMMMAXAAASAXSAXXAAAMAMXSASMXMAS
                SSMMSMAMSMSXMSMMSASXSXSAMSMMASASMMSASASMXMMXMMXMASAAAXAMMXSAMASMMMAXXMMMXSAMXXSAMSMMSSXXAAAMMSSMSASXMASMXMASAXAMSSMMMMMMMMXSSSMXSAMXSASXMSMS
                XMAMAXMXXAMAMAMAMXMXXASAXAXMXMXASASAMASMSAMXXSSMMMMMMMAMXMSASXMMASMMSSMMMSMMMMMMMASMXAMSMSMSAMXAMAMAXAMMMMAMMMSAAXSASASASXMAMAAXMASXMMMMXSXS
                SMASXSXASASAMAMXSSSSMASXMASMSMSAMXMAMXMASAMSXMAASAMSXXMMXASAMXMSAMAAXXAAAMAMMAAMXAXXMAXMAAXMAXMXMSMSMMMMAXMMSAAMXSMXSASAAMAMSXMMSXXAXAAXMSAS
                XMAXMXAXSAMXXXMAMXAAXMMMXAAAAAXASMSSMXMXMAMXASAMMASMXSXMXMMAMAAMASMMSMSMXSAMXMMSMSSXSXMMSMSSSMXXAMAXMAXSAXMAMXSAMXXXMMMMMASXSMSXXMMMSMMMAMMM
                SMSSSXSAMXMMSMSMXMSMMAAXXSXSMMSAMAMAXXXXSAMSAMASMXMMASAMXXMAMSSSMMAXAXAXXMMXSAMSAMAMXAXXMXAAXXAXMMSMMSAMXSMASAMAASAMSAMXXSMAXAMMXAAMAMXSMSMS
                SAXAMAXAMAAASAAAAMAXMMXMMXMXAMXAMAMMMMMMSSXMAXAMAXAMMMMSAMSMXXMAMXMSXSMSMSAAXAMMAMMMSXMMXMMSMAMSMAMAAXMSAAXAMXSMMAMAAASXMMMMMSMMMSXSASMSAAAA
                MMMAMMMSXSSMMSMSXSAMMSMMASXMSMSMSASXAXAXMXXSXMSSXSMXSXXXAXAMMMXAMAAXMSXAMMMSSMMSAMAMAAMSAMXAMAMXMAXMMSAMXSMMSAXASXXXSXMXXAAAAMAMAMXSAMAMSMMM
                SSSSMMXMXMXAAMXMASAMSAMMAXXAAAAAXASXMSXSAMXMAXXAXXMASMSMMSMSAMMSSMMXAMSXSAMXAMAXXXASXMMAMMXXSXMAXMXSAMXMAMMXMASMMMSXMAMAXXSSMSAMSXMMSMMMMMMM
                SAAXMMAMAXSSMSAXAMAMMAXMMSMSMMMSMSMMXAMMXAASMMMXMAMASAAAAAASMSAXAAAMMMMMSASMMMMSSMMXAXSMMSAMSAMAMSAMAMAXSXMAMAAXAAAMSXMASXAAMMMMAAMAMXXXAAAA
                XMSMSMASMMMMASMMSSSMSSMSAAXXASAMXMAMMASMMSXSXAMXSXMAMXMSSXXMAMXSMMXSAAAASXMASXSAMMSSSMXAAMAMSAMSSMASXMSAMXSSSSSMXSAMXXSASMMMMAAMSSMAXASMSSSS
                MXMAASMMMAASXMXXAAXMAAAMSSMSXMASAMAMSSMAAXAMMMXXMXMAXAXMAMXMXMXXXMASXSMXMMXAMXMASAXMMAMMMSMMMAMXAXAMMMMAMAMAAXXAMMMXXMMXMXSXSSMMAMMSMXMAMAMM
                XAMMMSXAXSXSMMXMMMMMSMMMAMASXMAXXXXMXAMMXXASAXXAXMSAMSSMSAMXAMXMMMXSAMXAASMSSXSAMMSAXSMSAAAASAMXSMXXAXXXMAMMMMSXMAAMMMXAAXXAMXXMASAAMXMAMAMX
                SASMAMMMMMASAMXMMXSAAXXMXMXMASXSMSMMSAMSSSSMAASMXMASMAAAMASMAMAAXMAMXSSMMMAXAAMXMXMMMXAMSSSMSAMXAAMSSSMMSXSXAXMAMXMMAXXMSMMMMAXSAAXASXSMMAXX
                MASMMMAXAXAXXMXSXXMAMSAMMSXSAMAAAAAAXAMAAMMMXMAAAXAAXAAMMAMMAXASMXXMSMASMMMMMMMAXAASAMXMAMAXMXSMMXMAAAAAAASMMMMAMMSSXMXMAMAAXSMMXXXSAMXASMMS
                AASAMMSXMAMSSMASMMMAXMASAAXMASMMSMMMMSMMSMSSSXMSMMMSAMMSXASXMSMXMAAMASAMXAXSMXSMMSXXMXSAMXXMSSMMXMMMSMMMMAMAMASXMAXMASMSMSSSXMAMAMSAXSAMXSAA
                MASAMAXXXMAAAMAXAMXXXSAMMMMMMMXXXXXSAXAXMAAAMXMAXXXMAMAMMAMXAAAAMSSMAMMXMMMMAAXMAMMMMAMAXXMASXAXMXAAXMAMXASAXMAAASMMMMMAXAXXMXAMASAAMXXXAMMM
                SASAMASASAMSSMASXMMSAMMMMASXMASMXMMMASAMXMMSMXSAXSMSAMASMMSMSMMMMAAMAMXSAMSSMMSMASAAMAMAMXASMMMMMSMMSASAMASASMMSMXAAAMMMMXMSMSSMXSMAAMMMXSAX
                AAXAMXSAMMAAAMASAAAMXXXASASAMMAMAMAMMMMMMSMMMMMMSMASXSASAAAAAXAMMSSMSAAMAMAAXXXMAXMMSXSAMXSAXSAAXAAXMAXAAMMMMAAMASMMMSXXXAAXMAAXXMXMXAAMAMMS
                MXSSSMMMMXMSXMASMMMSMMSXSASXMMMSXSXXXAXAAAAAMAAXAMMMAMAMMMMMMMMSAMMAMMXXMMSSMMAMSSMXAMMXSMMSXMASMMSMMAMXXSASXMMMAMMXAAMSMMXXMSSMXMASMMMSXSAS
                XMMAAASAMXXAMMXXAMAXAAMXMAMAASXMAXMASMSMMXSMSXSXSSMMXMSMMSXXAAXMAXMXMMMSMAAAASMXAAMMAMSASXMXMSAMXAXXMSMMASAMXMAXSMSXMSAMXSAMMAAAASASMMMAAMAS
                MMMMMSXMSASMSXSSSMAMSXSAMAMMMSAMXMXASAAMMMMASAMXMAMMMAXAAAMSSSSSMMAAAASAMXSSXMMXSMMSAMMMSASAMXMMMSMMMXAXAMXMSSXSAAXAMXXSAMASMSSSMXAMAASMMMAM
                MASAMXMXSAMXAAXAMMXXMASASXSSSSMMMXMXSXXSAAMAMAMMAMASMMXMAMXAMXMASMXXSMSASMMMMASAMAXMAMAXXMMASMMAAAAAASAMXSAXAAMSMMSXMAXMASAMAXAAAMSMSMSAAMAS
                SASMSAAAMASMMMMAMXMASAMXMAAXASXASAAMMXASMSMAMXMAMSAXSMAMXSMMMSMMMMAXXXSAMAAAXXMASMMMASMSSXSAMASMSSSMXMAMAXXSMXMXXASMMMXSAMXMMMMMXMMAXASMMSAS
                MASXSMSXMSMMAXMXMASMMMSSMMMMMMMMSMXAAXMSXAMSMSXXAMXXMMMSMMASAMMXSMMMSAXMASXSSMMXXMASXAMXAMMMSXMMMAXMASMMSSMMXMXXMXXAXAAMASXAMAXMXMMSMMMXAMAS
                MSMAMAMMXXASMSMXSMMXASAMXMXXAASXMMSMMMXMXMXMAMMSMMSMSAMAMMAMASXAXAAAMMMSXMAMMXSXMXMMXSASAMAXMAMSMMMSAMAAAAAMXSMMSASMMMMSMMMMSMSMXSAMXAXMMMAS
                SAMXMXMMAMAMXXMAMAASMMMMSXMSSSSXAASAMSXMXXAMAMAAXMMASXXXSMXXAMMSSSMSSXXMASMXAASMXAAAMXMSASXXSAMXAAAMAMMMMSSMMMASXMAAXAAAXMAXAMAMXMASMMSSSMSS
                AMMASXAMMSMSMSMSSSMXMASAMMMAMAMMMMSAAMAMSMMSSMSMSAMXMSMAMXSMXMMAXXMAMAMXMMXMMXSASMSSXSXSAMAASAMXSMSSMSSSMXXMAXSMAXSMMMSSSSSSSSSSXSAMAXAAAMAS
                MXMAXMAXXAASAMAAAMMMSAMASAMASASXMASMMXAMXAXAXAMXMMMAAAMAMAXAAMMMSMMMSSXXAXAAMMMMMAAAASAMSMMMSASAAXXAAAXAXSSSSSMSSMXXAMMAMXAXXAMAASMSSMMSMMAS
                XSMAXMSSMSMMAMMXSMAMMXXXSAMASXSXMXXASMXMMMMMXSSMAAXASMSSMMSSMSAMXXSMAMXMASMXSASXMMMMMMAMAXXXXAMMSMXMMMSMXMAAMXAAMAASXSMMMMMMMMMMMMAAXAXMAMMM
                AMMAMSAAXMASXMXAMMASMMSMMMSXMAXAXAXAMMMSSMAXSMAMSMSAMXXMAXAAXSASMAMMAMASXSAASXSAXXXXSSSMMSSSMMMXMAMXMXAXMMMMMMMMXSXSASAMASAAXAAAAXMASMMMSSSM
                AMAXMMASMXXMASAXMASAAASXAAMASMSXMMMMSXAAASMXXMXMAMMAMMSSMMSSMSAMMSMSXSMSAMMMSSSXMASXXAMXXAAAAASMXAAAMMXSAAAAAXAXXMSMASXMASMSMASXSSMMXAXXAAAS
                SSMSMMMMMXSSXMASMMMSMMMMXMSAMXMAAXAAAMMSMMMXXSMMXMSAMXAASAMXMMSMXXAAAXAMAMAMMASXMMXMXMMMMMSMSMSASMSXSAXMMSSSSSMSAXXMAMAMXMXXAMXXAAXAXMMMMSMM
                XAASASAAXSAMXMASAAXAXMASAXMXSASXMMMSSSXMASMSMAASAAXMASMAMSMXXAAXAMXMMMSMASASMAMMMAXSMXAXAAMMMXMAMAXAXMMXXMAXAAASMMSMXSMMASMMSMSMSMMMMSASAMXS
                MMMSAMMSSMMMXMASMMXMMSAMXMASMAXXAXXAAMXSMAAAMXMMAXXXMMXSSMSMMSSMMAAXMAASASAMMAXAMSSMASASMMSASMMAMXMMMSAMSMSMSMMMMSMXAMAMASMAAXAMMXAAAAAMXSAS
                SMXMAMAMXXXMAMASAMXSAMMSSMMMMAMMSMMXMAMMSMSXSMSSMMSSSMAXAAAXAAAMSSXSASMMMMMSSSSSSMAMXMAAXAXXXAXXXAASAMASXAXAXAAAMASMXSAMMSMSMSMAXASMSSMSXMAS
                SAXSAMXSASMSASASAMXMASAAXAAXMAMAAXMAMSMAXXXAMXAASXXAMMSSMSMSSMSMMAAAMXXAMSMMAAXMAMAMXMXMMMSSSSMSSSXMASXMMSMSMSXMSAMMXSXSXXAAAMXMSMXAMMMXAMAM
                MXMMMAAMASASASMSAMSMSSMMSSMSMAMSSMMMXMMSMMMMAMSSMXMXMAXXAXXAASAAMMMMXMMXXAAMMMMMAMXSSMAXAXMAAAXAAXXSMMMMAXAXAAXXMXSMMMMMMMSMSMAMMXMSMSXSXMAS
                MAMXSMMMAMMMAMASXMAXAXMXMAMAMAXMAMXAMMAMAXASAAMAMMMSMMSMXMMXMMSXMXXMXMASXSMMXSAMXXSAXSASXSSMMMMMSMMXASAMXMMMMMSXAMXMAAAMAMXMMMXSMAXXAMXMAMAX
                SMSAXAASMSSMMMAMASMMMSSSSSMSSMSMASXSXMAMMSMSAXSAMAAAAMXXSXAMSAMXMASXSMMSAMAMAMAXASAMXMMXAXAAMXMXMAMSXMAXXAXASMMMSMAMSXMSSSMMAMXMMMSMAMASXMSS
                XAMMSSMSAAMXXMSSMXXXXAAMAXAAAXAMMMMXAMASAMXXMAXAMMXXSMASXMXSAASAMAMMAAMMXMSMMSSMMSSXMSSSMSSMMMSMSAMMXSAMSMMMXAAAASMXMXMMXAMMMMAMAMXMAMMSAAXA
                MMMMAMMMMMSSSXAAXXMMMMSMAMMMMXXMAAAXXMAMMSSMMSSSMSXMMMMMAAXXXMMAMASXSXMAXXXAXAMAXXASAMXAXAAAMAAXSMSAAMAMAASMSSMSXMXAMASXSXMASMMSXSASASXSMMMM
                XXAMSSMXAXAASMSSMMMAAAAMMMXXXMSXSMXSAMXSMAXAXMAXAAMSASXSSMSMSSSXMXSXMAMMSMSMMXSXMAMMXXXMMSSMMMXXXAMMMSXSMSMAAMMXXMSXSAXAMASASAXAAXASAXMXSAAX
                SSMSAAMSSMMMMMAAXAXSXXSSSMSSMMSAAAASAMASMSMMMMAMMMXSASAAMAAASAMXMASMSAMSAAAASMMMSAXSSSSSMXMAASXSMMMSXMXMMMMMMXXAMMMAMMMSMAMASMMMSMXMXMMAMXMS
                AAXXMMMAMXAMXMXMMSMXAAMAMAMXAAMSMMMXAMASMAASAMXSASAMMMMMMXASMXSASMXAXASMMMMXMAAAXAXXAAAMMAMXMAAXAXASAMMMASXSMMMMSAMXMXAMMXSXSXMAXAMXXXMASAXM
                SSMSXXMAXSAMXMXXAXAMMMSAMXMMMMXMXXASXMASMSMXASASASMMAMAXMMMMMMSASXSSMXSMAAMASMMSSSMMMMMMSSSSSMMSSMASAMAMAMXAAAAXMMSMMMMSAMXMMMMAXXMXMMSAMASX
                MAAXMXMMMMSMXAAMXMMXMASAMASXASAMXXMAXSXSAXMSMMXSAMXSASMSMSAAAAMAMAXAAXMMSSMASAAAAAMSMXSAAXXAXXXXMMMMAMSMASXSSMMSXAAAXAXMAXSAASMSSSMASXMXMSAX
                SMXMAAXSAXAXXMXXXAXSMMMAXAMMAMXSXSXMXSAMAAASAMAMAMASMSAAASMXSSMSMSMMXSAAAAMSMMSMSSMXSAMMMSMMMSAMXAMMSMXMASAMXXMAMSSSSSMSAMXSXSAAAASXMAXAXAAX
                SAASXSXSXSMSMMASMMMASASMMSMSSSMMMSAMXMAMSAMXAMXSAMXSXXAMMMXMAMXAAASXASMMSSMXAXXAAMXMMMXAAAAAAXMASASAAXAMXSAMAMMMMAMXXXXMASAMMMMMSMMMSSMMXMSM
                MSMSAXXMMXXAXAAMAAAAMMSMAXAAAAXMASXMASAMMSXSXMAMXSXMXXXXSAMMASXMSMSMMSAAXAASXMMMMSAMASMMXSMMMMAMSAMXSSXSASAMXMAMMAMMMMXXAMAXAXAAAAAXAMXSAAXM
                MAXMMMXSASXMSMSMSAMXSASMXMMMSMMMMSASXSXSAXXMASXMAMAMMMMMMASMASAXAAXXMMMMSAMXMXAMASXXAXAXAXMAMXSAMMXSAMAAAXXMAMASMMMAASAMSSMMSMMMSSMSSMASMSMS
                MSMAMAAMXMAAAAAMXSXXMASMMMAMXMASMSAMAMAMMSMSMSAMXXAMAAAAMXMMASMMMSMSSXMXSXSAMMSSXMMASXMMXMASMMXAMAMMAMMMSSSSSMMMAASMSMMMAAAAXASAMXAAXMAXXXAX
                MAMAMMSXMXMMMMMSAMXMMXMAXXAMXAMXMMXMAMAMXAAAASAMASXSSSSSSXXMASAXXXXAAXSASMSASAAMMXAXXAXXAMAMMAMAMAMMAMXXAAAXAASMSMMXXAAMMSMAXAMXXMMMMMXMAMSM
                SASASXAMSSSMXAAMAXXAMXSAMMXSASXSXAXMASXSMMMMMMAMMSAAAMAAMAXMXMAMXXMMMMMASAMAMMSMASMMSSMSMSAXMASXSXSMSMMAMMMMMMMAMSMMSSMSXMASMMMSSSMSAASMSMAS
                SASASMASAAAMSMSMSSSSMAMASXMAXMAXMMXSASAMASAXAXXMXSMMMMMMMMXSSMSSXSAXXSMAMMMSMMMAXAAXAAAAAMMSMMSAXAAXMAMXMMSSSXMXMAXAAXAXASAXAMAAMAASMSMAAAAS
                MAMXMAMMMSMMMAXMAAAXMAXAMXXMSMSMSAAMAMAMAMASXSAMAMSXXSMMXSAMAAXAASMMAXMMSMMMASXSSSSMSSSMSMAAXSMXMMMASAMXMMAAAXSXSSMSSMMSAMASAMMSSMXMXAMAMMXS
                MXMMMSXXAAAXMAMMMMMMSMSMSMMXSAAAMMSMSSMMSSXAMSAMSSSXMMASAMXSMMMMMMMMXXAXMAMSAMXMAAMMMAAXXMMSXSASXSXAXAMAXMMXMMXAAAAXXAMMXMASAMSAMXAMXMSMXSAM
                SAMXAXMMSSSSMSSSMASXAMAAXAMAMXMSMXXXMAXAMXMMXMAMMXMXMSAMMSMMMXAXXMASMXMSSSMMAMXMMMMMMSMMXSMMAMAMASMXSASASMSSXSXSMMXMASXAXMXSXMMMSSXSAAAAAMAS
                SASMMMAAXAAAAAAASASXMSAXMSMMSMMMXMSXSAMMSAAXMMSMMASAXMAMAAAAMSASMSASAMXAAAMXAMXXAXXAAMASASAMAMXMAMAASAMMSAAXAXAXAXSSSMMMSMAMAMAXAAASMSMXXMAM
                SAMASMSMMMSMMMSMMXSAMAMAAXXAMAAXAMAAMAMMSASAXAMASASASMSMSXSMXAMXMMXSXAMMSMMMSMSMSSSMSMMMMMASXMAMXMXMMXMAXMMMMMXMXAMMAAXXAMAXAMXMMAMXMXMASMMS
                MAMSMMAAAXMAMXAMXAMAMASXSSMMSSMSSMMSMSAAMXMMMXMAMASAXAXAXAMMSSMAXSAMXMAMXXSXMASAMAAXMASASXXMMSAMAMAXASMSMXXASMMAXMSSSMMSXSMSSSXXSASAMXMAMAMX
                SSMMASMMMMASXMAMMAMAMXMMAAAAAAAAMMXXAMMXSAMAXMASMMMXSMMAMXMAXASXSMASXMSMMMAAMAMXMSMMSASASMAMXSASMSASMSAAMXSXXMASXMAXAMXAXMXAAAAMMAXMXAMAMSMM
                XMAMAMXAAXMAASMMMSSMSSSMSMMMMSMMXXXMAMXASASMSMAXAXAASXSXSMMMMXMMXMAMMAAAASMMMXMXMAMXXXMAMMAMAMXMXAMSAMMMSASAASMMAMMSSMMMSSMMSMXMMAMMSMSMXXAS
                ASXMSSSMMXMSMMMAAAAMAAXAAMASXXAXXMXSSMMMSAMXXMMSMMMXSASAMAAXMMXXMASAMSMSMSAMSASXSASXXXAASMMSXSXXXSSMMMXXMAXAXMAMMMXAAAAAAAAAXAXXMAMXAXXMASXM
                XSXAXAMXSXMMSAXMMSSMMSMSMSASASXMASAXAXMMMMMMAMXAMXMAMXMAMMMXSAXAASXSMMXMAMXMSAAASAMMMSSXSAMXXMMXAXMAXAXSMSMASMXMSSMSSMMSSSMMSXMXMASXMMSMASAM
                XMMMMAMAMAMASMMSMMAXAXAMXMAXMAMXXMMSMMMAMXAAAXMSSSMXMASAMXAXXSXMXAAAXSAMXMSASAMXMAAMMAMMSAMXAAMMMMSMMASXAMXAMMMMAAXMAMAAAAAASAMXMASAAAMMASAM
                MMAMSAMAXAMXSMAMAMAMMSXMXSMSXMSMAAAAXASASMMSMSAAAXSAMXMMXMASMMMSMMMMXMXXAXMAMMXXMSSMAASASMMSMSXAAMASASMMSMMMSAAMSSMMSMMMSMMASMMMMXSAMMSMAMXM
                XSAMSXSSSXMXXMAMAMXSXSAXAXAMXMAMSMSSMMAMXMXAAXMMMMSMSAAXAMXXAAAAAXXXASMSMSMSMSMSMAAMSMMMXAMXAMMSXSAMSAXAAMAMMMMMMAAAXASXXXMAXMASXMMMSXXMSSSM
                MSXMMAMMAMSMSMMSSMXMASAMMMXXASAMMAAXXAXMAMSMSMXXSASMSAMMASAMSMSSSMXMAXXAXXXAAXAAMXMXXXXXXMMMXMAXXMAMXMMSSSSSSMSASXMMXMMAMXMXMMAMMAAAMXAXAAXA
                AXMAMAMXAAAXMAMAXSXMAMXXXAMSXSXSMMMSMMASAMAAXAXXMASAMASXMMMMMAXAMMMSSMXSMSXMSMSMSMXMXMMSMSASAMXMMMMMXXAAXXXAAAMXMMSSSXMXMAXASMMSSSMSMSAMMSMM
                AAAAXAMMXSXSSSMASXSMASAAMAXMASAMXAAMMAAXMSMSMMSASMMAMAMAXAXAMMMMXSAAAMAMMSAXMAMXAAASMMMAASAMXMXMAMMMSMMSSSMMMMSMMXXMAASXMXSXMASMMXAXMXAXMMMM
                SMSSSMMSAMAMAXMSMAXMMMMXSMSXMXSXSMSMSMSSMXAAAASASMSXMASMSXSXSXXXAMMSMMMSASMMMAMSMSASAAMMXMXMASAMSXAAAAMXAXAXMXAAMSMMSMMAXMAXSMMAAXMMMSMMSAMX
                XMMAAAAMAMSMSMXAMXMMSMMAAAXAMSMXSAXAAXMAMSXMSMMXMAAXXAXXMXSAMMMMMSAMXSXMMMMASAXXXMASMMXSAMMSASASAXMXSSMXMSMMXSMSMAAXAAXMMSAXXSSSMMSAXAMMXASA
                XAMSMMMSSMXAAASMMMAXAAMSSMXSMAMAMAMXMXMAMXMXXXAXMAMAMXSAAAMAMAXAAMASAMAMAMSASMSMXMMMXXMMASAMXSXMMXSAMXXAXAASAMXAXXMSASMSAMXSAAMAAAMXMMXXMASX
                SMMMAMAAMAMXXXMXXASXMSMAAMAMSMSSMAMSMSMASXAXSMSMSAXMAXSAMXSSMSSSSSXMMMAMMMMXSAAXAXMAMMSSXMMSAMAMXAMASAMMSSMMASXXMMAMAMAXMMXMAMSXMMSSMSAMSAMX
                SXMSAMMSXXMSMMMSXMXAAMMXXMAMAXMAAAXAAXSAMMSMMAAASXSASXXAAAMAAAXXAXAXXXAMXASAMXMSXSMMSAAAXXMMASASMMXXMASAAAASAMMAMSASAMMMSSMSSXMXMXXXAAAMMASM
                MAASXSSXXMMAXAAAAXXMSXAMSMMSAXSMMMXMXMMMXAAASXMXMMMMMXSAMXSMMMSMMMSMSSSSSXMMSAMXXXMAMMSMMSMSMSASXSXMMAMMSMMMAMXAXSAMXMSAMXAXMASXMMMSAMXMSSMM
                SSMXMMAMXSSMSMSSMMXXAMAMMAXAMXSAAXASMSASXSSXMMSXXAAAAXXXSASMAASAAAAMXAAXMAMASMMMSSMSSMAMXXAAAMXMASMXMASXAXMMAMSMXMSMMXMSSMMMXXMAASASXXMMSAMX
                AXMASMAXXAAMAAAAAXXMMMXMSSMSMASMMSAMAMXXAAMXMASXSSSMXSXMMASAMAXXMASMMMMMSAMXSMSMAMAAAAASAMXMMMXMMMAASXSMSSSMMMASAAAMMSMAMAMSXSMSMMASMMAXXAMX
                MAMXXMASMMSMSSSXMMMMSSSXAMAXMAMXMAMMAMMSMMMASMXAMXMXAMXMMMXMASXXXMAXAAAXSMSXSASMSMSMSSMSASXSMMMSMMSMSMSAMAMXXSASMSMSMAAASAMXAXAAAMAMASMMSAMX
                XSSXSAMXAXMAXXMASXSAAAMMMSSMMMSMSAMXXMAAAASXSXMMMAAMMSAXAMAAAXMASXAXSMSMSXSXMAMXXAXAMMXXAMASAMASAAXAXAMAMAMXXMXMAMAAXSSMSASMMMSMSMMSXMAXSMMX
                XAAAMASMSMMXMMMXXAMMXXMAXMAMXMAAMASXMMMSXMMAMXAAMAXSXSXXXMXMMMMMMMMMMMMMMASXMAMMMMMMMSAMXMAMAMXSMMSMMXSMMAMSMMAMMMSMXMAMXXMAMAMAXMASXMXMSAMX
                MMAMMAMAAXMAMMMSSSSXSAMXXAMMAMMSMAMAXXXXXSMSMAXSXSASMMASMMSMSASASMXAMAAAMAMXSAXAAXSSMXSMAMMSXMXXAAAXMXSXSAXAAMSMMAAXAAAMMMSXMASXMASXMSXXXAMX
                AMAXMAXXMASAXAMXAAAASAMSSSXSSSMMMSSXMXXXAMAMXMSAAXASMSMMAAAASASASAMSSSMSMXMXSXXSMMMAMAMMAXMAMXASMXXSXAMAXXXSMMAAMSSSXSMSXAXAMASASXXAXXMMSSMM
                SASMSMSMXAMMMSXMAMMMMAMAAAAAAAAMAMAMXMMMXMXSAMMMSMASAAXXXMMMMMMMMAMMAXAXAASXMXXAASXSMAXMASMMMMMMMSMMMXSMSSMMXSSXMXAXMXAXMMSXSAMAMASMMMMAAXSA
                ASMAMXAXSXXSAXXSAMAXSXMMSMMMSSMMXSAMAAAASMMMMSMAXMAMXMSASMXXXAAAXXMAMMMMMMSAASMMMMAXSXSMMMMAAAXAAAAASAMXAXXAXMASMMMMMMXMAMAXAMMAMXMMAAMSSMAS
                SXMAMSSMSAAMASMMASXMMAMXMXSMXMMAMSASMSMXSAAMXAMXSMMSMMAXMASMSSSSSSXAXAXAAMMMMMXSAMXMXMSAAASMSMSMSXSAMAXMAXSMMXAAXAMAASXMSAXAMSSSSXASXMXAXAMX
                AXMSXXAAMMMMXSASAMXXSAMASXSAAXMAXXMMXAMMMXMMXMSMMAMMMXSAMXSXMXAMAMSSSXSSSXMSAXMAMXMMMASXMMSXMASAMXXMMMSXSAXMASMSSXXMSSMAMMMMXAAAMXXMAXMXSXXM
                MASXMSMMMXXXAMMMXMMMMASAMXMMSMSMSXSSSSMAMMSSSXSMSAMAAXMMSMMAMMXMAMAXMAXXXAASMSXMASAAAXMSSMSAMXSASMSMSAAAAMMMAXSAXXMXMMMAAAAMMMSMAMXMAMSASAMX
                XMXAXAMASXMMMSSMAMXAXXMMSSMAMASASXAAAXMAMXAAMASASMSMSXSASASAMAMSSSXMSMSAMMMMASMXXASXMSAMXAMMMAXAMAAAMMSMMXXMSXMXMASAAXSSSMXXAAAXAMMXSXMAXXAA
                MXSMSMSASAAXAAAMAXMSMMAAAAMAXAMAMMMMMMSASMMMMAMXMASXMAMAMAMMMMMMASXAXAMAMXMMXMAMXMMSMMXMMMMSMSSSMSMMMXMAXXAMXAMXMAXMSMAAMMMSSSSSSXXAMAMAMSSM
                AMAMAMMMXMMMMSSSMSAMASMMSXMXSSMMMMXSXMXAMXASMMSMMMMASXMSMSMXSMAMAMMXMMMMMAMSAMAMXMASXAXXXXAXXAAAMXMSXXSXMSXAXAMMMMMXAXSMXAMXXAXAAXMASAMAAAAM
                SSMSASMMXMAMXAXAMMMSMMAXMMSAMXAXMAASXMMSMMMSAAMAAMSXMSAAAAASAMXMXXMAMAAAMXXSAXMSXMMSMMSMMMMSMMSMMAMXMAMMXMMXSAMAAMASAMXSSMSXMXMXMMSASXSMMSSM
                XAASASAAASXSMMXXMAMXASAMMAMAMSXMMMXMAMAMASASMMSSMMAAXASMMAMMMXAMAMXMMSSSMXASAMSXXSAMXMAXAAMSMXAASXSASXSMAXMXSASMMXAMASAAMXMXASXMXAMXXMXMAAAX
                SMMMAMMMMSMAAAASMSSSXMAMMAMAMXMMSMSSSMASXMAXXXAMXAXXMMXMXMSMXXMMASAAXMAXAMXMXMAAAMASXSASMXXXSSSXMAXASAAXMXMAXXMASMSMAMXMSASMSAXAXSMXXSAMMXSM
                SAXMXMMXMXMMMMXSAAAXMASXSSSMSAMMSAAAXXAMAMXMSMMSSXMMSMASAAAMAMXSASMSMMAMXMAMMSMSMSAMAMMAMMASAMXMASMAMMMMSAMSSXMAMAXMXMSXSAXSMXMSMAMAXMAMSAXX
                MMSMMMSAMMSMXMSMMMMMMAXXAMAMSMSAMMMMMMSAMXAAAASAMASAAMASMXMXMAMMASAAAMMMXXMXAXAAAMMMXMMAAXXMASMXAXMXSAMASXSAAXSSMSMMMMMMMMMMMMAAMAMXSSMMMASA
                MAAXAMSASAAMAMXMAXXAMXSAXSAMXMMMSSXXXAXAXSMSSSMASAMSSMXMXAXXSXXMAMXXSAAAXSSSSMSMSMAXAXSXMXXXMAMMSSXAXAMASXMAMMXMAAXAAAAMASAAAMSMSMSSMASXMMMM
                MSSSXXXXMXMMMXASMSSSSXMMMXXSXXSXAMMMMMMMMXAAMAMAMXMAXXAASXSAAASMMSXMMMMSSMAAXMXMMXMSMMMAXSSMSSSMAXMMSMMMXMASXASMSMSSSSXMAXXSMXAAAMXAMAMXAAMX
                MMAAXSSSMSXMXSASAAAMAAMXSXMMMMMMAXAAAASMMMMMXSMXMXMSSSMXMAXMSMMAMAMASAMXAMMMSSXMAXXXMAMXMAAAAAMMMMSAMAAXXAMXMSMAAXXMAXAMMSAMXSMSMMMXMASXSMMS
                XMMMMAAAASMMAAMMMMMMSSMAMAAAAAXSAMSMSMMAASMSXAXXXAMMAMXAMMMXMXSXMAMXSAXXAMXMMMMMSSMXSMXAXMMMMMMSXAMASXSSSMXXMAMXMSSXMMXMAAAMXMXXAASXMSXMAAXA
                MXSAMXSMMMAMMSXSXXXXAXMAMASXMXMMMMMAMASMMMAAXMMASASMAMSMSAAAMXMXSSSMSXXMSMXMAMXAMAMXMASMXXAMXXAMMASXMAXAASAMXMSAMAMMSMMMMSMMAMMMSMSAXMASXMMA
                AMXXMAAAXSMMXAMAXMAMMMSSXMXMASXSXAMAMAMAAMXMXSAMAMXMAMXXMXXASAMMXAAASXMSAAMSSMMXSAMSMAAMXSSSSMSSMMSAMMMXMMMSAXSAMMSAAASXMAASAMMAMXSAMSXMAMMX
                SSSSMMMSMMSMMMAMSAXXSMAXSAMXAAASMMXAMSSSMMMSAMXXASXMXSXMSSSXSXSSMSMMMAXSMSMXMASAMAMXXSMSAAAAXMAAXASAMSMSXXAMMMSAMAXXSXMAMXXSASMMXAMXMXMSXMXS
                AAAMASMAXMAXAXSXSXMASMAMMMMSAMXSASMXXAAAXXXMASASASAMASAMAAXAMMMAAAAMXMMXMXMASAMASASXAMAMMSMMMMMSMMSAMAASAMMMSASXMXSMMASMMMMMAMAMSAMMMAXXAMMS
                MMMSAMSAMSMSSXXXMAMMXMASXAAAXXXSAMASMMMMMMXSXMMSASMMASAMMMMXMASMMMMMSXMXMAXMMSAAMASMMMXMXMXMASAAAMMMMSSMAMAMMASXSXSASAAMSASMMMXMAMSASXMXAMAM
                XXXMXMMMXAMAXMXSMXMMAMAMMMSMMMAMSMAMAXMSMSASAAAMAMAMASMMSAMXMXMAXXMASAMXSMSMMMMMMXMXXMAMXMAMAXSMMMAAAXAMXMXSMAMASAMXMMMASASXMSSSMASASAMXAMAS
                XSAMXSAMAAMAMMASAXASASAMSAMAAXXXAMXSSMSAAMASXMMSASXMAXMAMASMMSSMMMMAXAMMMMAAAXAXXMASMXAMAMAMSMMMSXSSMSAMSMXMMAMXMAMXXXXXMAMXXAAAXMMMMAMSXSAS
                MMAAAXAMSMMSSMAXMSXSXXAAMAMSAMXMMXXAMXMMSMXMMXXMXXAMMMMXSAMAAMAMSSMMXAMAAXSSMMSMMMXXAXSSMSASXAMAMXAMXSAMMAAMMXXXAMSMMMSMSMMMMMSMMXSAMAMAXMAS
                ASXMSMXMMMAMAMXMXMAMAMSMMMMMSMXSXMXMASMXMASXMASMSSMMSAMXMASMMMAMMMASMMSSSMAXAAMMSASMSMAAASXSMMMASAXXAXAMXSMSMMXMAMAAAAAAAMAAAMXXXAXXXSMSMSAS
                MMMAXMMSMMASXMMAAMXMAXAAXSAAMXAAAXMMMMMXXAMASAXXAAXASMXAMAMASMMSXMXMAAAAXMAMMMMAXAMAAMMMMMMSAMMMSXMMSSSMXXMXASMMMSSSMSMSMSSSSSSMMAMSMXAXAMAS
                MAMAMMASASXSAAMSSMXSASMSXXMSSMSSXMAAAMXMMMMXMSSMSMMXXMMMMAXXMAAMAMXSMMMSMMXSXAMSMSMSMMXXAXAMAMSXMAMXXAMMSAMSXMASAAXMAMAAAXAAAAAXASAAAMAMMMMM
                SAMXSMASXMAMMSMAAMXMXXMAMMAAXAAMAMMSMMAXAMMXAXXAAXXMXSAMSSMASXMMAMASAMXMAMAMMXMXAXAXASMMSSMMAMXASAMMMMSASAMAXXAMMSMMSMMMSMMMMSMSAXSMMMSMMAAX
                SASAAMMMAMXMAMMSSMAXMXMAXMAMMMMSSMAXMSSSXSASXXMXMSSMAMMMAASAMXASXSXSXMASAMASMMSMSMMMMMXAMAMXSMMMSASXAMMASMMMSSXXSXMAAAMAMAXXAAAMMXAXSXMASXSS
                SAMXMAXSXMXMAXAXAMSSMAMSXSASXMAXMMMSAAMAAMAXAASXXAAMXMXMSMMXSSXMASAMMSAMAXAXAAAAAXMAMXMXMASAMAAXXAMMXSMAMAAXMAXMSAMSSSMASMMSAMXMSSMMXAMMMAXM
                MXMMXSXMASXXMMXSAMASMAMXASAXAMSXSAMXMMSMMMMMSAMAMMSAMXSAMAAXXXMXAXASXSMSSMMSMSMSMSXSXMAXSAMASXMSMSXSMSMSMSMSAMXXSAMXMAMASAMXXMASXAXSMSMAMMMS
                SMSXAMMXAMXMSSMSAMAXSASMMMSMSMAASMMXAXXAXAXAMAMMXMAMMASAXMASMMSMMMXMAMXAXSXMAAAMXMXXAMSAMXSMMAAXAMAMXXAMXXXSAXXAMAMXSMMMXAMXXXXSMMMSAAXSAMXA
                MAMMMMAMSSXXAAXSXMSXMXSAXAXMASMMMSSMMMMMMMMXXAMXMMMXSASAMXSXAAAASASMSMXMASMMSMSMAXAXAMXMSASMSMMMMMMSAMMMMXASXMMMSSMMXMAXMMMMSSMSAAAMXMMMAMAM
                MAMAMMSMMAMMXSMXMMMAMMSXMAMSMSXSAMXAAAASAMMXSASXXAAXMAMXMMAMMSMSXASAASAMAMAMAAAMMMMXMMMMMAMXMAMASAAXMXMAMMMMMSXMAAAXXMAMXASXSAASMMXMMMASAMXA
                SAMMSAMASAMSAXMSXSSSMASMSMASMMMMAMSXMSMSASAAXAMXSMSSMMMASXAXAXXMMMMXMXXXXMXMMSMMSMSAMAASMSMXSAMXSMSXXAXASAMMASAMSXMMSMAXSAMSSMMMASXSAMASAMMS
                SMSAMXSASAMXASASAAAAMAMAAMAMAAXXMMSAMXMSAMXSMAMXXMAAXAMAXSMMMMMSAAAXXSSMSMSXMAAXAASASMMSAXAAXXMMXMMMSXSASASMAMAMXMSASMAMMAMXMXMASMAAMMASAMAA
                XAAMSMMXSMSMAMAMMMMMXXMMMMASMMSXMASAMMMMXSAMXSMSAMXSSMMSMMXXSAAXSMSXMXAAAASMSSSMMXMMXMAMXMMMSSSMSAMXAASXSXMMMXMMMAMASMMXSMMXSXXMASXMXSASMMXS
                MMMAMXMMSASXXMSMSXXXAMSMMSMSMASXMAMAMAAAXMASXAMAMXAAAXAXAXMASMSXMXAXSSMMMXMAXXAMXMSSXMXMASXMAXAAMAMMMXMAMXSXMASAMAMAMASMMAAAXXMMAMXXXMMMASMA
                XMMAMAAAMAMMMMXAXSSMMMAAXAMXMAMMMMSSXSMSSMSSMMMAMMMMMMAXSXMAMXMASMMAXAMXSSXSMSSMSAAASXMSASAMSXMMSAMAMSMSMASASAMAMXMXSAMASMMXSASMSSSMSSMSAMXS
                MAMAMXMMMAMAAAMMMXMASXMSSXMAMMMXAAAAXXXMXMAMAXSXSASASMXXMXMASASMMAXMSAMASMAMAAAAAXSMMXXMASXMMAXMMASXSXXAMASAMXSXMSXXMAMXMAAXSAMAXAAAAAMMSMXM
                ASXSSXSASMSSMXSAMXMSMMAAAASMSMSSSSSMXMAMSMMMSMMASAMAXMAMMAXMSASMSSMXSAMXSMAMMMMSMAXXSXSMMSAMSXMSSMMMMXMMMAMXMASAAXAMSSXMMMMXMMMXMSMMMSMAXMMX
                SXAAAXSAMAAAAMSXMMSXAMMMXMXAAAAAXAMXAMAMXASAXXMAMAMSMSAASAMXMMMAAAMASAMXSMMSXXXAMASAMXXAAMAMMSMAAASXSAMXMMSMMASMMMXMAMAMSAMXXMMSXMASXMMSMMSM
                MMMMMMMMMMMMMMMAMSMMSMASASMSMMMMMMMSMSAXSAMXSMMMMMMXASXXMMSAAASMSSMASAMXMAMXMXMAAXMMMSSMMSXMAAMSSMXASXXAXAXAMAMAXASMSXSMSMSMSSXMASMMMMAMAASA
                AAXAXXAXXXSASASAMAMMMMMXAAAXMASAAAMXAAMAAAMAXMASAAAMXMSXAAMMXMXXMAMASAMMSAMMMASXMASXAXAMXAAMXSMMAASMMMSAXSSMMSSMMMSXMAXAMMAAAMASMMXASMAMMMMS
                SSSMSSMSMMSASMXAXXSAXXSMSMSMSASMSMSMMMMXMAXXXSASXSMXMAMMMMSSXMMMSXMMMAMASMSXSASAXASMSSXMMSXMAMASMMSAAXMSMAAAAMAMXMMAMAMAMSMMASXXAXSAMMSSMXAX
                XAAXAAMAAMMMMXMXSAMXSXMAAAAMMMSAXASAMXXMXXAMXSXMAXAAMAMAAXAMMSAAXXMXSAMXSAAAMXSAMXSAAAAXXMAMASAMMASMMMAMMSMMSSSMSASXMSSXMXXMAMMSSMMXXAXAAMMX
                MSMMSSMMMSAAAAXMAXMAMMMSMMMSAAMMMAMAXXSMSMSMAMASXMSXSASMSMMSASMSMSAASMMMMMMSMXSASXMMMSXMASAMAMMMMAXASXXSAAAAAAMASAAXAXAAMXSMSSMAMAXMASMMMSSS
                AAXAAAAXXSMMSSSXAMSAMXAAAAXSASAMMAMSAMXAAAAMASAMAAXMAXSAAASMMSAXAMMXMAMSAMXAXMSAMMAAAAXAXSXMMSXXMASAMMAMXSSMMSMAMSMAMMSMMSAMXAMASMMASXAAAAAA
                SSSSSSMMXMAMMMXMAMSMMMSSSMXXMMMXSXSMSXMAMSMSXMXSMMMXMASXXSMSMMMMXMAMXAXSXMSAMXMXMSSMSXMSAMXASMXMAMAMXMMMMMAMXXMXXAXXXAXSXXXMSAMAXXASMSSMMMSM
                """;
    }
}
