package X;

/* renamed from: X.1VQ  reason: invalid class name */
public abstract class AnonymousClass1VQ {
    public final int version;

    public abstract void createAllTables(1W6 r1);

    public abstract void dropAllTables(1W6 r1);

    public abstract void onCreate(1W6 r1);

    public abstract void onOpen(1W6 r1);

    public abstract void onPostMigrate(1W6 r1);

    public abstract void onPreMigrate(1W6 r1);

    public abstract C21382XZp onValidateSchema(1W6 r1);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.1VQ.validateMigration(X.1W6):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public void validateMigration(X.1W6 r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.1VQ.validateMigration(X.1W6):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VQ.validateMigration(X.1W6):void");
    }

    public AnonymousClass1VQ(int i) {
        this.version = i;
    }
}
