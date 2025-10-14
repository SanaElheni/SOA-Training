package graphql;

import business.ModuleBusiness;
import business.UniteEnseignementBusiness;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entities.Module;
import entities.UniteEnseignement;

import java.util.List;

public class QueryModuleResolvers implements GraphQLRootResolver {

//    private ModuleBusiness moduleHelper;
//
//
//    public QueryModuleResolvers() {
//        moduleHelper = new ModuleBusiness();
//    }
//
//    // Retourne tous les modules
//    public List<Module> allModules() {
//        return moduleHelper.getAllModules();
//    }
//
//    // Retourne un module par son matricule
//    public List<Module> getModuleByMatricule(String matricule) {
//        Module module = moduleHelper.getModuleByMatricule(matricule);
//        return module != null ? List.of(module) : List.of();
//    }
//
//    // Retourne les modules par type (PROFESSIONNEL / TRANSVERSAL)
//    public List<Module> getModulesByType(String type) {
//        Module.TypeModule moduleType = Module.TypeModule.valueOf(type.toUpperCase());
//        return moduleHelper.getModulesByType(moduleType);
//    }


}

