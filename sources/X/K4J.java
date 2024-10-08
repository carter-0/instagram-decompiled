package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class K4J extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorActivationNullStateFragment";
    public int A00;
    public C14072TpM A01;
    public ViewPager2 A02;
    public C60729JqI A03;
    public String A04;
    public List A05;
    public boolean A06 = true;
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final String getModuleName() {
        return "channel_creation_null_state_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager2 viewPager2 = (ViewPager2) view.requireViewById(R.id.null_state_pager);
        this.A02 = viewPager2;
        String str = "viewPager";
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(2);
            List list = this.A05;
            if (list != null) {
                this.A00 = list.size();
                UserSession A0l = AnonymousClass7TE.A0l(this.A08);
                List list2 = this.A05;
                if (list2 != null) {
                    C60729JqI jqI = new C60729JqI(this, A0l, this, list2);
                    this.A03 = jqI;
                    ViewPager2 viewPager22 = this.A02;
                    if (viewPager22 != null) {
                        viewPager22.setAdapter(jqI);
                        ViewPager2 viewPager23 = this.A02;
                        if (viewPager23 != null) {
                            C14072TpM tpM = this.A01;
                            if (tpM == null) {
                                str = "onPageChangeListener";
                            } else {
                                viewPager23.A05(tpM);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("slides");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(538700700);
        K4J.super.onCreate(bundle);
        this.A01 = new C60731JqK(this, 4);
        AnonymousClass0fD.A09(2068514747, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1722999481);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_null_state, false);
        AnonymousClass0fD.A09(-160181433, A022);
        return A0D;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(861582296);
        super.onDestroyView();
        ViewPager2 viewPager2 = this.A02;
        if (viewPager2 == null) {
            str = "viewPager";
        } else {
            C14072TpM tpM = this.A01;
            if (tpM == null) {
                str = "onPageChangeListener";
            } else {
                viewPager2.A05.A00.remove(tpM);
                AnonymousClass0fD.A09(-1007891853, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
