
package View;

import java.util.Date;
import java.util.List;
import model.Aerodromo;
import model.AerodromoService;
import model.Aeroporto;
import model.AeroportoService;
import model.AreasUrbanizadas;
import model.AreasUrbanizadasService;
import model.ArmazemService;
import model.CargaAereo;
import model.CargaAereoService;
import model.MunicipioService;
import model.Municipio;
import util.JPAUtil;
import model.Estado;
import model.EstadoService;
import model.Ferrovia;
import model.FerroviaService;
import model.Porto;
import model.PortoService;
import model.Rodovia;
import model.RodoviaService;



/**
 *
 * @author caian
 */
public class Application {
    public static void main(String[] args) {
       

       
       //Lista ferrovias vizinhas
       FerroviaService ferroviaService = new FerroviaService();
       List<Ferrovia> ferrovias = ferroviaService.listarFerroviasVizinhas("Nova Transnordestina");
       for (Ferrovia f: ferrovias){
            System.out.println(f);
       }
       
       //Lista estados vizinhos      
       EstadoService estadoService = new EstadoService();
       List<Estado> estados = estadoService.listarEstadosVizinhos("Paraíba");
       for (Estado e: estados){
            System.out.println(e);
       }
       
       //Lista municipios da PB
       MunicipioService municipioService = new MunicipioService();
       
       List<Municipio> municipios = municipioService.municipiosDaPB("PB");
       for (Municipio m: municipios){
            System.out.println(m);
       }

     
       //Lista rodovias que atravessam GBA
       RodoviaService rodoviaService = new RodoviaService();
        List<Rodovia> rodovias = rodoviaService.rodoviasAtravessamGba("Guarabira");
       for (Rodovia r: rodovias){
           System.out.println(r);
       }
 
       
       //Lista portos que intersectam a região SUL
       PortoService portoService = new PortoService();
       List<Porto> portos = portoService.portosIntersect("Sul");
       for (Porto p: portos){
           System.out.println(p);
       }
       
       //Lista distância entre aeroportos
       AeroportoService aeroportoService = new AeroportoService();
       double distancia = aeroportoService.distanciaEntreAeroporto("João Pessoa", "Campina Grande");
       System.out.printf("dsitancia em km: %.2f", distancia / 1000);
 
       //Lista cargas do cruzeiro do sul
       CargaAereoService cargaAereoService = new CargaAereoService();
       List<CargaAereo> cargaAereo = cargaAereoService.totalCarga("Cruzeiro do Sul");
       for (CargaAereo c: cargaAereo){
           System.out.println(c);
       }
       
       //Aerodromos que estão dentro da PB
       AerodromoService aerodromoService = new AerodromoService();
       List<Aerodromo> aerodromos = aerodromoService.aerodromosDaPB("PB");
       for (Aerodromo a: aerodromos){
           System.out.println(a);
       }
       
       //Verificar as areas que estão com uma determinada condição
       AreasUrbanizadasService areasUrbanizadasService = new AreasUrbanizadasService();
       List<AreasUrbanizadas> areas = areasUrbanizadasService.tipoArea("Vazio intraurbano");
       for (AreasUrbanizadas ab: areas){
           System.out.println(ab);
       }
       
       //Vê o número das coordenadas do poligono do armazem
       ArmazemService armazemService = new ArmazemService();
       String poligono = armazemService.poligonoArmazem("conquista");
       System.out.printf("poligono do armazem: %s", poligono);
       
       
               
       
       
       
       
 
       

      
    
       JPAUtil.close();
     
    }
       
}
