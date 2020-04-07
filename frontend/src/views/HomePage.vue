<template>
  <div>
    <div class="body">
      <h1>Padtec</h1>
      <TabView>
        <TabPanel>
          <template slot="header">
            <i class="pi pi-users"></i>
            <span>Quem Somos</span>
          </template>
          <h3>O mundo inteligentemente conectado que nós fazemos</h3>
          <p>
            O mundo inteligentemente conectado que nós fazemos Oferecer ao mercado
            soluções avançadas de transmissão óptica flexíveis e de alta capacidade,
            baseadas na tecnologia DWDM e integralmente desenvolvidas no Brasil, tem
            sido o foco da Padtec, a maior fabricante de transporte óptico na América Latina.
            Resultado de uma forte vocação para pesquisa e desenvolvimento, a
            tecnologia pioneira da Padtec percorre grandes distâncias e desafia
            limites para conectar o mundo de forma inteligente.
          </p>
        </TabPanel>
        <TabPanel>
          <template slot="header">
            <i class="pi pi-th-large"></i>
            <span>Sustentabilidade</span>
          </template>
          <h3>Meio ambiente</h3>
          <p>
            A Padtec acredita que ao implantar pequenos hábitos no cotidiano dos seus funcionários,
            como a eliminação do desperdício de qualquer material e de preservação da natureza,
            a idéia da preservação e do respeito ao Meio Ambiente se difunde com mais rapidez.
            A adoção dessas atitudes tem como conseqüência direta a melhora na qualidade de vida
            das pessoas dentro e fora da empresa. Estes efeitos são percebidos também pelas pessoas
            a sua volta, transformando os colaboradores em agentes multiplicadores em seu
            círculo social. Praticar ações que resultam na preservação do meio-ambiente faz
            parte da nossa cultura.
            O Comitê do Meio Ambiente tem como finalidade ampliar a já existente proposta da
            Padtec em cuidar da natureza, oferecendo aos seus colaboradores diretos, orientações
            adequadas sobre a importância em se preservar o Meio-Ambiente em toda a sua amplitude
          </p>
        </TabPanel>

        <TabPanel>
          <template slot="header">
            <i class="pi pi-money-bill"></i>
            <span>Acionistas</span>
          </template>
          <Accordion>
            <AccordionTab>
              <template slot="header">
                <i class="pi pi-bookmark"></i>
                <span>CPQD</span>
              </template>
              <p>
                O CPQD é o maior polo de tecnologia da América Latina e um dos mais
                conceituados no mundo em telecomunicações e tecnologia da informação,
                com mais de 1.200 profissionais altamente qualificados.
                Responsável pelo mais extenso programa de P&D em TIC na América Latina, o CPQD é
                totalmente dedicado a prover soluções para telecomunicações, finanças,
                energia, entre outras indústrias, tanto no setor privado como público.
              </p>
            </AccordionTab>

            <AccordionTab>
              <template slot="header">
                <i class="pi pi-bookmark"></i>
                <span>IdeiasNet</span>
              </template>
              <p>
                A IdeiasNet é uma companhia com ações negociadas na Bovespa (“IDNT3”),
                que investe em empresas do setor de Tecnologia, Mídia e Telecomunicações
                (“TMT”). Visando a maximização de valor para seus acionistas, a
                Ideiasnet atua ativamente em suas investidas na definição de estratégias,
                no posicionamento de mercado e na estruturação de fusões e aquisições.
              </p>
            </AccordionTab>

            <AccordionTab>
              <template slot="header">
                <i class="pi pi-bookmark"></i>
                <span>BNDESPAR</span>
              </template>
              <p>
                BNDESPAR é responsável pela operação de renda variável, realiza investimentos
                em empresas dos setores prioritários na estratégia do BNDES, como energia
                renovável, fornecimento de óleo e gás, tecnologia da informação e comunicações,
                biotecnologia, etanol (segunda geração) e green technology.
              </p>
            </AccordionTab>
          </Accordion>
        </TabPanel>
      </TabView>
    </div>
    <div class="p-grid">
      <div class="p-col-6">
        <Card>
          <template slot="header">
            <img alt="user header" src />
          </template>

          <template slot="title">
            <p>Atendimento ao cliente</p>
          </template>

          <template slot="content">
            <p>Telefone - 0800 771 9009 -- sac@padtec.com</p>
            <p>Para informações ligue +55 (19) 2104-9700 -- info_padtec@padtec.com</p>
          </template>
        </Card>
      </div>

      <div class="p-col-6">
       
          <Card>
            <template slot="header">
              <img alt="user header" src />
            </template>

            <template slot="title">
              <p>Atendimento ao cliente</p>
            </template>

            <template slot="content">
              <p>Telefone - 0800 771 9009 -- sac@padtec.com</p>
              <p>Para informações ligue +55 (19) 2104-9700 -- info_padtec@padtec.com</p>
            </template>
          </Card>
        
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  }
};
</script>

<style>
.body {
  margin: 10px 10px 10px;
}
</style>