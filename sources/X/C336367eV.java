package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import java.text.DecimalFormat;

/* renamed from: X.7eV  reason: invalid class name and case insensitive filesystem */
public final class C336367eV extends C336937fQ {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        int i = 0;
        if (this.A04) {
            i = 1;
        }
        r3.A7U(i);
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.9uN, java.lang.Object] */
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        String quantityString;
        TextView textView;
        boolean z;
        int i3;
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(34258545);
        if (view == null) {
            Context context = this.A00;
            int A033 = AnonymousClass0fD.A03(-907365454);
            if (i == 0) {
                view = LayoutInflater.from(context).inflate(R.layout.row_autocomplete_hashtag, viewGroup, false);
                ? obj4 = new Object();
                obj4.A01 = (TextView) view.requireViewById(R.id.row_hashtag_textview_tag_name);
                obj4.A00 = (TextView) view.requireViewById(R.id.row_hashtag_textview_media_count);
                view.setTag(obj4);
                i3 = -977914284;
            } else if (i == 1) {
                view = C18795W2d.A00(context, viewGroup);
                i3 = 470599682;
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass000.A00(1046));
                AnonymousClass0fD.A0A(-1867648190, A033);
                throw unsupportedOperationException;
            }
            AnonymousClass0fD.A0A(i3, A033);
        }
        Hashtag hashtag = (Hashtag) obj3;
        int A034 = AnonymousClass0fD.A03(-1296400035);
        if (i == 0) {
            Context context2 = this.A00;
            Object tag = view.getTag();
            tag.getClass();
            C392199uN r8 = (C392199uN) tag;
            boolean z2 = this.A03;
            r8.A01.setText(0mp.A06("#%s", new Object[]{hashtag.getName()}));
            if (z2) {
                r8.A00.setVisibility(8);
            } else {
                if (hashtag.CWZ() == null || !hashtag.CWZ().booleanValue()) {
                    Resources resources = context2.getResources();
                    if (hashtag.BPt() != null) {
                        i2 = hashtag.BPt().intValue();
                    } else {
                        i2 = 0;
                    }
                    0qQ.A0B(resources, 0);
                    if (i2 <= 0) {
                        quantityString = "";
                    } else {
                        DecimalFormat decimalFormat = new DecimalFormat();
                        decimalFormat.setGroupingUsed(true);
                        decimalFormat.setMaximumFractionDigits(0);
                        quantityString = resources.getQuantityString(R.plurals.number_of_public_posts, i2, new Object[]{decimalFormat.format((long) i2)});
                        0qQ.A0A(quantityString);
                    }
                    textView = r8.A00;
                } else {
                    textView = r8.A00;
                    quantityString = context2.getResources().getString(2131971350).toLowerCase();
                }
                textView.setText(quantityString);
                textView.setVisibility(0);
            }
        } else if (i == 1) {
            UserSession userSession = this.A02;
            Context context3 = this.A00;
            AnonymousClass0iw r1 = this.A01;
            HashtagImpl FEY = hashtag.FEY().FEY();
            C66967Mg0 mg0 = new C66967Mg0(new C66966Mfz());
            Object tag2 = view.getTag();
            tag2.getClass();
            C17935ViQ viQ = (C17935ViQ) tag2;
            boolean z3 = this.A03;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(context3, 1);
            0qQ.A0B(r1, 2);
            0qQ.A0B(viQ, 7);
            ImageView imageView = viQ.A04;
            Boolean bool = FEY.A07;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C18795W2d.A01(context3, imageView, r1, FEY, !z);
            C18795W2d.A02(imageView);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0mp.A06("#%s", new Object[]{FEY.A0D}));
            C253073qA.A00(userSession).A01(spannableStringBuilder);
            viQ.A05.setText(spannableStringBuilder);
            C18795W2d.A03(FEY, mg0, viQ, z3, false);
            viQ.A00();
        } else {
            UnsupportedOperationException unsupportedOperationException2 = new UnsupportedOperationException(AnonymousClass000.A00(33));
            AnonymousClass0fD.A0A(870476219, A034);
            throw unsupportedOperationException2;
        }
        AnonymousClass0fD.A0A(-529641284, A034);
        AnonymousClass0fD.A0A(-1416080654, A032);
        return view;
    }

    public C336367eV(Context context, AnonymousClass0iw r5, UserSession userSession, boolean z) {
        this.A00 = context;
        this.A01 = r5;
        this.A04 = z;
        this.A02 = userSession;
        0qQ.A0B(userSession, 0);
        this.A03 = 182.A06(0Tu.A05, userSession, 36323418890579094L);
    }
}
