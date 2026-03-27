# Atividade 27/03 python Sistema de Informação

usuario = {
    "Mateus": {"nome": "Mateus", "senha": "1234"},
    "Gabriel": {"nome": "Gabriel", "senha": "4321"}
}

user = input("Usuario: ")
password = input("Senha: ")

if user in usuario and password == usuario[user]["senha"]:
    print("Seja bem vindo", user)
else:
    print("Senha incorreta, tente novamente")