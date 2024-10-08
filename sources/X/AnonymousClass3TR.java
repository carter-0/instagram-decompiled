package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.mediaactions.LikeActionView;

/* renamed from: X.3TR  reason: invalid class name */
public final class AnonymousClass3TR extends C249703kE implements AnonymousClass2xU {
    public long A00;
    public C262754Fw A01;
    public AnonymousClass3W1 A02;
    public AnonymousClass2xS A03;
    public boolean A04;
    public boolean A05;
    public final ViewGroup A06;
    public final AnonymousClass3TX A07;
    public final AnonymousClass3TS A08;
    public final ReboundViewPager A09;
    public final AnonymousClass3TY A0A;
    public final AnonymousClass3TV A0B;
    public final AnonymousClass3TT A0C;
    public final AnonymousClass3TW A0D;
    public final LikeActionView A0E;
    public final View A0F;
    public final UserSession A0G;

    public final View A00() {
        Object tag;
        View view;
        View view2 = this.A09.A0F;
        if (view2 == null || (tag = view2.getTag()) == null) {
            return null;
        }
        if (tag instanceof C262804Gb) {
            view = ((C262804Gb) tag).A0F;
        } else if (tag instanceof C279064y1) {
            view = ((C279064y1) tag).A0E;
        } else if (tag instanceof C55778HnD) {
            view = ((C55778HnD) tag).A03;
        } else if (tag instanceof C254173s3) {
            view = ((C254173s3) tag).A04;
        } else {
            throw new IllegalArgumentException(AnonymousClass000.A00(2533));
        }
        return view;
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        BaseAdapter baseAdapter;
        int i2;
        Object obj;
        AnonymousClass3VD r0;
        Adapter adapter;
        ReboundViewPager reboundViewPager;
        Runnable pww;
        if (i == 18) {
            ReboundViewPager reboundViewPager2 = this.A09;
            View view = reboundViewPager2.A0F;
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            if ((obj instanceof C262804Gb) && (r0 = ((C262804Gb) obj).A0I.A04) != null && r0.A06 && (adapter = reboundViewPager2.getAdapter()) != null && (adapter instanceof AnonymousClass4G8)) {
                baseAdapter = (BaseAdapter) adapter;
                i2 = -1050832465;
            } else {
                return;
            }
        } else if (i != 38) {
            if (i == 22) {
                reboundViewPager = this.A09;
                pww = new PWW(this);
            } else if (i == 23) {
                reboundViewPager = this.A09;
                pww = new PWX(this);
            } else {
                return;
            }
            reboundViewPager.post(pww);
            return;
        } else {
            Adapter adapter2 = this.A09.getAdapter();
            if (adapter2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (adapter2 instanceof AnonymousClass4G8) {
                baseAdapter = (BaseAdapter) adapter2;
                i2 = 563310743;
            } else {
                return;
            }
        }
        0fE.A00(baseAdapter, i2);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.3TY] */
    public AnonymousClass3TR(View view, AnonymousClass0iw r5, UserSession userSession) {
        super(view);
        this.A0F = view;
        this.A0G = userSession;
        View requireViewById = view.requireViewById(R.id.carousel_media_group);
        0qQ.A07(requireViewById);
        this.A06 = (ViewGroup) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.like_heart);
        0qQ.A07(requireViewById2);
        this.A0E = (LikeActionView) requireViewById2;
        this.A08 = new AnonymousClass3TS((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
        this.A0C = new AnonymousClass3TT((ViewStub) view.requireViewById(R.id.carousel_index_indicator_stub), userSession);
        View requireViewById3 = view.requireViewById(R.id.carousel_card_loading_indicator);
        0qQ.A07(requireViewById3);
        this.A0B = new AnonymousClass3TV((ViewStub) requireViewById3);
        View requireViewById4 = view.requireViewById(R.id.save_to_collection_upsell_view_stub);
        0qQ.A07(requireViewById4);
        ViewStub viewStub = (ViewStub) requireViewById4;
        0qQ.A0B(viewStub, 0);
        this.A0D = new AnonymousClass3TW(viewStub, r5);
        View requireViewById5 = view.requireViewById(R.id.branded_content_violation_banner);
        0qQ.A07(requireViewById5);
        ViewStub viewStub2 = (ViewStub) requireViewById5;
        0qQ.A0B(viewStub2, 0);
        this.A07 = new AnonymousClass3TX(viewStub2);
        View requireViewById6 = view.requireViewById(R.id.carousel_viewpager);
        0qQ.A07(requireViewById6);
        this.A09 = (ReboundViewPager) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.media_note_view_stub);
        0qQ.A07(requireViewById7);
        ViewStub viewStub3 = (ViewStub) requireViewById7;
        0qQ.A0B(viewStub3, 1);
        ? obj = new Object();
        obj.A00 = viewStub3;
        this.A0A = obj;
    }
}
