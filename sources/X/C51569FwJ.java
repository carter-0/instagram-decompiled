package X;

import android.content.Context;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.function.Function;

/* renamed from: X.FwJ  reason: case insensitive filesystem */
public final /* synthetic */ class C51569FwJ implements Function {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C51959G9f A02;
    public final /* synthetic */ JS9 A03;
    public final /* synthetic */ C283155Gi A04;

    public /* synthetic */ C51569FwJ(Context context, C51959G9f g9f, JS9 js9, C283155Gi r4, int i) {
        this.A02 = g9f;
        this.A03 = js9;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = context;
    }

    public final Object apply(Object obj) {
        C51959G9f g9f = this.A02;
        JS9 js9 = this.A03;
        C283155Gi r3 = this.A04;
        int i = this.A00;
        new F22(g9f, js9).A00((JV7) null, r3, (InlineLinkUrn) obj, i);
        return null;
    }
}
