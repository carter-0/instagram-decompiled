package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Lyh  reason: case insensitive filesystem */
public final class C65727Lyh implements C315616kD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IgdsInlineSearchBox A02;

    public C65727Lyh(IgdsInlineSearchBox igdsInlineSearchBox, int i, int i2) {
        this.A02 = igdsInlineSearchBox;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void DaF(C294975nL r5, float f) {
        this.A02.setSearchRowHeight(this.A01 + ((int) ((1.0f - f) * ((float) this.A00))));
    }
}
