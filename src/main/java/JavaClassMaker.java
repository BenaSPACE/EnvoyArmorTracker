//This is included as some legacy code that was used to generate some classes used in this application.
//Ultimately they have no purpose in the final product, but are left here for the parity, as it was still used earlier.



//import com.sun.codemodel.JCodeModel;
//import org.jsonschema2pojo.*;
//import org.jsonschema2pojo.rules.RuleFactory;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//
//public class JavaClassMaker {
//    public static void main(String[] args) throws IOException {
//        convertJsonToJavaClass(new URL("https://api.guildwars2.com/v2/account/achievements?ids=2646&access_token=959E8DF5-7485-3141-88C9-F86DFCBC636294D5F61A-9AD8-4057-9893-655B317AB802"),
//        new File("../Envoy_Prog_Tracker"),
//                "Envoy_Prog_Tracker",
//                "EnvoyArmorII");
//    }
//    public static void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
//            throws IOException {
//        JCodeModel jcodeModel = new JCodeModel();
//
//
//        GenerationConfig config = new DefaultGenerationConfig() {
//            @Override
//            public boolean isGenerateBuilders() {
//                return true;
//            }
//
//            @Override
//            public SourceType getSourceType() {
//                return SourceType.JSON;
//            }
//        };
//
//        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
//        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);
//
//        jcodeModel.build(outputJavaClassDirectory);
//    }
//}
