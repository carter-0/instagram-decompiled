package X;

/* renamed from: X.IjG  reason: case insensitive filesystem */
public final class C57961IjG implements Runnable {
    public final /* synthetic */ AnonymousClass6LO A00;
    public final /* synthetic */ AnonymousClass6L7 A01;
    public final /* synthetic */ AnonymousClass62H A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C57961IjG(AnonymousClass6LO r1, AnonymousClass6L7 r2, AnonymousClass62H r3, String str, String str2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = str;
        this.A00 = r1;
        this.A03 = str2;
    }

    public final void run() {
        String str;
        try {
            AnonymousClass62H r0 = this.A02;
            C52510GVn A012 = r0.A04.A01(this.A00, this.A01, this.A04, (String) null, true);
            String str2 = this.A03;
            AnonymousClass62C r1 = r0.A01;
            r0.A00.Az1();
            AnonymousClass6L8 A022 = ((AnonymousClass6OE) r1.A00(str2).A00).A02(A012, false);
            A022.A02();
            AnonymousClass6L8.A00(A022, "prepare_render_start", (String) null);
            AnonymousClass6L8.A00(A022, C273654mx.A00(3140), (String) null);
            A022.A03();
        } catch (C242623Vf unused) {
            str = "Cannot create carousel logger";
            0wb.A03("IgCarouselHandler#logCarousel", str);
        } catch (AnonymousClass92D unused2) {
            str = "Failed to get drawable provider due to missing user session";
            0wb.A03("IgCarouselHandler#logCarousel", str);
        }
    }
}
