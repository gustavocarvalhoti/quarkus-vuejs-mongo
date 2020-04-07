import Vue from 'vue'
import App from './App.vue'
import router from './router'

//Primevue
import 'primeflex/primeflex.css';
import 'primevue/resources/themes/nova-light/theme.css'    //theme
import 'primevue/resources/primevue.min.css'               //shared css
import 'primeicons/primeicons.css'                         //icons
import DataTable from 'primevue/datatable';
import Column from 'primevue/column';
import ColumnGroup from 'primevue/columngroup';
import Button from 'primevue/button';
import Menubar from "primevue/menubar"; 
import TabView from "primevue/tabview";
import Panel from "primevue/panel";
import TabPanel from "primevue/tabpanel";
import Accordion from "primevue/accordion";
import AccordionTab from "primevue/accordiontab";
import Card from "primevue/card";



import TodoButton from '@/components/todo-button/TodoButton';
import TodoMessage from '@/components/todo-message/TodoMessage';
import "font-awesome/css/font-awesome.css";

Vue.component('TodoButton', TodoButton);
Vue.component('TodoMessage', TodoMessage);

Vue.component('ColumnGroup', ColumnGroup);
Vue.component('Column', Column);
Vue.component('DataTable', DataTable);
Vue.component('Button', Button);
Vue.component('Menubar', Menubar);
Vue.component('TabView', TabView);
Vue.component('TabPanel', TabPanel);
Vue.component('Accordion', Accordion);
Vue.component('AccordionTab', AccordionTab);
Vue.component('Card', Card);
Vue.component('Panel', Panel);

Vue.config.productionTip = false




new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
