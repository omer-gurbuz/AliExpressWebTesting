Feature: Car and Motorcycle Functionality
  Scenario: Product Page test
    Given Navigate to AliExpress
    And Go to the element
    |carAndMotoTite|
    |KaskVeKorumaTite|
    And Clicking function control with actions
      |KaskVeKorumaTite|
    And Verification function checking in the AliExpress
    |koruyucuDonanimVerify|Koruyucu Donanım|
    And Clicking function control on the AliExpress
      |gelenGemiSelect|
      |turkeySelect|
      |siyahKaskProduct|
    And Switch between the pages
    And Clicking function control on the AliExpress
      |sizeXL|
      |addToCartButton|
      |viewShoppingCartButton|
      |checkboxButton|
      |deleteButton|
      |kaldirButton|
    Then Verification function checking in the AliExpress
      |cartVerify|Sepete henüz ürün eklenmedi|

