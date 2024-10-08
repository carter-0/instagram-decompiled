package X;

public final class AR5 implements C344497rx {
    public final int A00;
    public final Object A01;

    public static void A00(C391719tX r1, AR5 ar5) {
        0qQ.A0B(r1, 0);
        ((C344497rx) ar5.A01).DQF(r1);
    }

    public AR5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DQF(C391719tX r4) {
        0wj r2;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817896864;
                str = "ClipsArFrameLiteRendererCallback Media Graph Error";
                break;
            case 1:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817896864;
                str = "IgArFrameLiteRendererCallback Media Graph Error";
                break;
            case 2:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817896842;
                str = "IgFeedArFrameLiteRendererCallback Media Graph Error";
                break;
            case 3:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817896842;
                str = "IgStoriesArFrameLiteRendererCallback Media Graph Error";
                break;
            case 4:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817896842;
                str = "StoriesArFrameLiteRendererCallback Media Graph Error";
                break;
            case 5:
                AnonymousClass9Tu r22 = (AnonymousClass9Tu) this.A01;
                Object obj = r22.A0M;
                synchronized (obj) {
                    r22.A0Y = r4;
                    r22.A00--;
                    obj.notifyAll();
                }
                return;
            case 6:
                A00(r4, this);
                r2 = 0wj.A01;
                i = 817892945;
                str = "IgOneCameraServiceFactory Media Graph Error";
                break;
            default:
                C344497rx r0 = ((ADF) this.A01).A00;
                if (r0 != null) {
                    r0.DQF(r4);
                    return;
                }
                return;
        }
        AnonymousClass7TG.A1I(r2, str, r4, i);
    }
}
