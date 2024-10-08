package X;

public final class WSY implements C232262tL {
    public final C53290Glc A00;
    public final JZA A01;
    public final C18043VkR A02;
    public final String A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A01();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WSY wsy = (WSY) obj;
        0qQ.A0B(wsy, 0);
        if (0qQ.A0K(this.A02, wsy.A02) && 0qQ.A0K(this.A03, wsy.A03) && this.A00 == wsy.A00 && this.A01 == wsy.A01 && this.A04 == wsy.A04) {
            return true;
        }
        return false;
    }

    public WSY(C53290Glc glc, JZA jza, C18043VkR vkR, String str, boolean z) {
        AnonymousClass7TG.A1Q(str, glc);
        this.A02 = vkR;
        this.A03 = str;
        this.A00 = glc;
        this.A01 = jza;
        this.A04 = z;
    }
}
