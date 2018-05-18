

public class GlyphLoader{

   public GlyphLoader(java.lang.String filename){
   
   }

public class EntryCircle
extends A_Entry{
   public EntryCircle(int index,
                     EntryVertex vertex,
                     double radius,
                    EntryColor color){
                    
                    }
}

public class EntryColor
extends A_Entry{

   public EntryColor(int index,
                  java.awt.Color color){
                  
                  }

}

public class EntryEdge
extends A_Entry{
   public EntryEdge(int index,
                 EntryVertex start,
                 EntryVertex end,
                 EntryColor color){
                 
                 }
}

public class EntryVertex
extends A_Entry{
   public EntryVertex(int index,
                   double x,
                   double y,
                   double z){
                   
                   }
}

public class LayoutBundle
extends java.lang.Object{
   public LayoutBundle(java.util.List<java.util.List<EntryEdge>> edgeLists,
                    java.util.List<EntryCircle> circles){
                    
                    }

}


public class InvalidLayoutException
extends java.lang.Exception{
   public InvalidLayoutException(int lineNum){
   
   }
}
}