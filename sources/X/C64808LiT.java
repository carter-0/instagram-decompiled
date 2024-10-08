package X;

import com.instagram.mediakit.model.MediaKitSectionType;

/* renamed from: X.LiT  reason: case insensitive filesystem */
public abstract class C64808LiT implements C232262tL {
    public int A00 = -1;
    public C61220JzD A01;
    public MediaKitSectionType A02;
    public C65329LrS A03;
    public String A04;
    public String A05;
    public String A06;
    public final C61220JzD A07;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final boolean isContentSame(Object obj) {
        C61220JzD jzD = this.A07;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.mediakit.ui.model.MediaKitSectionModel<*>");
        return 0qQ.A0K(jzD, ((C64808LiT) obj).A07);
    }

    public C64808LiT(C61220JzD jzD, C65329LrS lrS) {
        this.A07 = jzD;
        this.A03 = lrS;
        this.A01 = jzD;
        this.A05 = jzD.A03;
        this.A06 = jzD.A04;
        this.A04 = jzD.A02;
        this.A02 = jzD.A01;
    }
}
