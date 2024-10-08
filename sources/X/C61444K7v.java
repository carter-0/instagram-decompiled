package X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import java.util.List;

/* renamed from: X.K7v  reason: case insensitive filesystem */
public final class C61444K7v extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FundraiserPhotoPickerFragment";
    public L9U A00;
    public String A01;
    public List A02;
    public ViewPager A03;
    public IgSegmentedTabLayout A04;
    public C60083JfP A05;

    public final String getModuleName() {
        return "fundraiser_cover_photo_picker";
    }

    public final void configureActionBar(2da r3) {
        String str = this.A01;
        if (str == null || str.isEmpty()) {
            r3.Eom(2131962819);
        } else {
            r3.setTitle(str);
        }
        r3.Eu4(true);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(8);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1181978892);
        C61444K7v.super.onCreate(bundle);
        AnonymousClass0fD.A09(827241888, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2124493691);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker);
        AnonymousClass0fD.A09(773672276, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(649524659);
        super.onDestroyView();
        this.A04 = null;
        this.A03 = null;
        C60083JfP jfP = this.A05;
        jfP.getClass();
        if (jfP.A01 != null) {
            0s1 r1 = new 0s1(getParentFragmentManager());
            r1.A03(jfP.A01);
            r1.A01();
            jfP.A01 = null;
        }
        if (jfP.A00 != null) {
            0s1 r12 = new 0s1(getParentFragmentManager());
            r12.A03(jfP.A00);
            r12.A01();
            jfP.A00 = null;
        }
        this.A05 = null;
        AnonymousClass0fD.A09(-2021025196, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-808408040);
        C61444K7v.super.onPause();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(0);
        }
        AnonymousClass0fD.A09(1942966876, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-994786660);
        super.onResume();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(8);
        }
        AnonymousClass0fD.A09(1696270639, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.A03 = view.requireViewById(R.id.view_pager);
        UserSession session = getSession();
        L9U l9u = this.A00;
        l9u.getClass();
        List list = this.A02;
        list.getClass();
        C60083JfP jfP = new C60083JfP(this, l9u, session, list);
        this.A05 = jfP;
        this.A03.setAdapter(jfP);
        this.A04 = (IgSegmentedTabLayout) view.requireViewById(R.id.tab_layout);
        int size = this.A02.size();
        IgSegmentedTabLayout igSegmentedTabLayout = this.A04;
        if (size > 1) {
            igSegmentedTabLayout.A02((View.OnClickListener) null, new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131962824, true));
            this.A04.A02((View.OnClickListener) null, new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131962823, true));
            this.A04.setViewPager(this.A03);
            igSegmentedTabLayout = this.A04;
            i = 0;
        } else {
            i = 8;
        }
        igSegmentedTabLayout.setVisibility(i);
    }
}
