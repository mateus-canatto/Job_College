# Atividade 27/03 python Sistema de Informação
import time
usuario = {
    "Mateus": {"nome": "Mateus", "senha": "1234"},
    "Gabriel": {"nome": "Gabriel", "senha": "4321"}
}

erros_totais = 0

while True:
    user = input("Usuario: ")
    password = input("Senha: ")
    if user in usuario and password == usuario[user]["senha"]:
        print("Seja bem vindo", user)
        break
    else:
        erros_totais += 1
        print("Senha incorreta, tente novamente")
        
        tempo_minutos = 3 * (6 ** ((erros_totais - 1) // 3))
        tempo_segundos = tempo_minutos * 60
        
        print(f"Sua conta foi bloqueada por {tempo_minutos} minutos")
        time.sleep(tempo_segundos)