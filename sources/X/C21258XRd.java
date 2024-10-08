package X;

/* renamed from: X.XRd  reason: case insensitive filesystem */
public enum C21258XRd {
    BrandedContent("Branded Content"),
    BusinessGrowth("Business Growth"),
    CompanyAccountAccess("Company Account Access"),
    ContentAppreciation("Content Appreciation"),
    CreatorAi("Creator AI"),
    CrossMetaExperiences("Cross Meta Experiences"),
    HighRes("High Res"),
    LiveVideo("Live Video"),
    LoggedOut("Logged Out"),
    MediaSolutions("Media Solutions"),
    Render("Rendering"),
    StoriesInteractions("Stories Interactions"),
    ThreadsApp("Threads App"),
    UIInfra("UI Infra"),
    VideoCall("Video Call");
    
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        C21258XRd[] xRdArr;
        A02 = 0oU.A00(xRdArr);
    }

    public static C21258XRd A00(String str, int i) {
        return new C21258XRd(str, i, str);
    }

    /* access modifiers changed from: public */
    C21258XRd(String str) {
        this.A01 = str;
        this.A00 = ordinal();
    }
}
