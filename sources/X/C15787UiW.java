package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.UiW  reason: case insensitive filesystem */
public final class C15787UiW extends C232222tE {
    public final Activity A00;
    public final UserSession A01;
    public final VOA A02;
    public final VOB A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C15946UlG ulG = (C15946UlG) r7;
        AnonymousClass7TG.A1N(ulG, r8);
        VOA voa = this.A02;
        View view = r8.itemView;
        0qQ.A06(view);
        C17586Vae vae = voa.A00.A0J;
        if (vae == null) {
            0qQ.A0F("viewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        C2354830a A002 = AnonymousClass30Y.A00(ulG, vae.A05, 002.A0R("grid:", "map_tile_with_pins"));
        A002.A00(vae.A04);
        C51967G9n.A0z(view, A002, vae.A01);
        Object tag = r8.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.mediamap.binder.MediaLocationMapRowViewBinder.Holder");
        VS4 vs4 = (VS4) tag;
        C298775u0 r4 = ulG.A00;
        UserSession userSession = this.A01;
        VOB vob = this.A03;
        DbZ.A0t(0, vs4, userSession, vob);
        vs4.A01.A0G(new WFQ(userSession, vs4, r4, vob));
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Activity activity = this.A00;
        0qQ.A0B(activity, 1);
        double d = C14723U4m.A0p;
        C18585Vuc vuc = new C18585Vuc();
        vuc.A0A = false;
        vuc.A0E = false;
        vuc.A06 = "ig_media_location";
        vuc.A01("MediaLocationMapRowViewBinder.java");
        vuc.A08 = AnonymousClass1GD.A03();
        C14723U4m u4m = new C14723U4m((Context) activity, vuc);
        u4m.setTag(new VS4(u4m));
        return new C249703kE(u4m);
    }

    public final Class modelClass() {
        return C15946UlG.class;
    }

    public C15787UiW(Activity activity, UserSession userSession, VOA voa, VOB vob) {
        C51974G9v.A1M(userSession, vob, voa);
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = vob;
        this.A02 = voa;
    }
}
