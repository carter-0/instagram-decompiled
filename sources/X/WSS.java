package X;

public final class WSS implements C232262tL {
    public final C53290Glc A00;
    public final JZA A01;
    public final C18043VkR A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A01();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WSS wss = (WSS) obj;
        0qQ.A0B(wss, 0);
        if (!0qQ.A0K(this.A02, wss.A02) || !0qQ.A0K(this.A03, wss.A03) || this.A00 != wss.A00 || this.A01 != wss.A01) {
            return false;
        }
        return true;
    }

    public WSS(C53290Glc glc, JZA jza, C18043VkR vkR, String str) {
        AnonymousClass7TG.A1Q(str, glc);
        this.A02 = vkR;
        this.A03 = str;
        this.A00 = glc;
        this.A01 = jza;
    }
}
