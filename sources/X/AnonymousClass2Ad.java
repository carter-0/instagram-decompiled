package X;

/* renamed from: X.2Ad  reason: invalid class name */
public final class AnonymousClass2Ad implements AnonymousClass28l, AnonymousClass0lh {
    public C254703su A00;
    public AnonymousClass2Ep A01;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2Ad.getContentInBackground(android.content.Context):java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String getContentInBackground(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2Ad.getContentInBackground(android.content.Context):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ad.getContentInBackground(android.content.Context):java.lang.String");
    }

    public final String getFilenamePrefix() {
        return "direct_visual_message_log";
    }

    public final String getFilenameSuffix() {
        return ".json";
    }

    public final String getTag() {
        return "DirectVisualMessageBugReportLogger";
    }

    public final void onSessionWillEnd() {
        this.A00 = null;
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }
}
