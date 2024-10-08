package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel;
import java.util.Collection;

public final class E7K extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChannelsFeaturedEventListFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C46570DhC(this, 7));
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final C49329Etk A03;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        C61037Jvb jvb = ((ODY) ((ChannelsFeaturedEventListViewModel) this.A02.getValue()).A03.getValue()).A00;
        String str = null;
        if (jvb != null) {
            str = jvb.A00;
        }
        r5.setTitle(str);
        r5.Eu4(true);
        if (jvb != null) {
            String str2 = jvb.A01;
            String str3 = jvb.A02;
            if (str2 != null && str3 != null) {
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A0K = str2;
                A0K.A0P = true;
                A0K.A02 = C242363Tt.A01(requireContext(), R.attr.igds_color_creation_tools_blue);
                DbX.A19(new C50101FOr(str3, (Object) this, 4), A0K, r5);
            }
        }
    }

    public final String getModuleName() {
        return C273654mx.A00(648);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0t = DbS.A0t(this.A00);
        AnonymousClass0eM r4 = this.A02;
        AnonymousClass0Ud r2 = ((ChannelsFeaturedEventListViewModel) r4.getValue()).A03;
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 7), C48263Ebi.A00(07U.A05, getViewLifecycleOwner().getLifecycle(), r2));
        ((ChannelsFeaturedEventListViewModel) r4.getValue()).A01(A0t);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new C68574NNv(this), new Object(), new EG3(this, this.A03)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 25));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E7K() {
        C46570DhC dhC = new C46570DhC(this, 12);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C46570DhC(new C46570DhC(this, 9), 10));
        this.A02 = DbS.A0I(new C46570DhC(A002, 11), dhC, new C73915Plq(21, A002, (Object) null), DbS.A0z(ChannelsFeaturedEventListViewModel.class));
        this.A03 = new C49329Etk(this);
        this.A01 = C227642jf.A02(this);
    }
}
