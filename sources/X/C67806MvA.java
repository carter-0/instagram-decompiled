package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.MvA  reason: case insensitive filesystem */
public final class C67806MvA extends 2Rw {
    public final Context A00;
    public final UserSession A01;
    public final C74447Pv2 A02;
    public final List A03 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        IgTextView igTextView;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        if (i == 1) {
            return new C67966Mxq(A0D.inflate(R.layout.direct_quick_reply_hints, viewGroup, false));
        }
        View inflate = A0D.inflate(R.layout.direct_quick_reply_text_item, viewGroup, false);
        boolean A06 = 182.A06(0Tu.A06, this.A01, 36329702427738374L);
        C67966Mxq mxq = new C67966Mxq(inflate);
        if (!A06) {
            return mxq;
        }
        ViewStub A0F = DbS.A0F(inflate, R.id.quick_reply_label);
        if (A0F != null) {
            igTextView = (IgTextView) A0F.inflate();
        } else {
            igTextView = null;
        }
        mxq.A00 = igTextView;
        return mxq;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r9, int i) {
        int i2;
        C67966Mxq mxq = (C67966Mxq) r9;
        if (mxq.mItemViewType != 1) {
            C67569Mq3 mq3 = (C67569Mq3) this.A03.get(i);
            IgTextView igTextView = mxq.A02;
            igTextView.getClass();
            igTextView.setText(mq3.A03);
            IgTextView igTextView2 = mxq.A01;
            igTextView2.getClass();
            igTextView2.setText(mq3.A02);
            IgTextView igTextView3 = mxq.A00;
            if (igTextView3 != null) {
                int A002 = OPZ.A00(mq3.A00);
                if (A002 != 0) {
                    Context context = this.A00;
                    DbT.A18(context, igTextView3, A002);
                    i2 = 0;
                    String A0u = DbV.A0u(context, mq3.A03, "", 2131954368);
                    igTextView.getClass();
                    igTextView.setText(A0u);
                } else {
                    i2 = 8;
                }
                igTextView3.setVisibility(i2);
                Integer A003 = C69998Nvc.A00(mq3.A00);
                if (A003 != null) {
                    JTS.A0u(this.A00, igTextView3, A003.intValue());
                }
            }
            C71405Ok4.A01(mxq.itemView, 40, this, mq3);
            mxq.itemView.setOnLongClickListener(new C71417OkI(0, this, mq3));
        }
    }

    public C67806MvA(Context context, UserSession userSession, C74447Pv2 pv2) {
        this.A02 = pv2;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1054698566);
        int size = this.A03.size() + 1;
        AnonymousClass0fD.A0A(1670675421, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1616879138);
        int i2 = 0;
        int i3 = -1316002149;
        if (i >= this.A03.size()) {
            i2 = 1;
            i3 = -827634769;
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }
}
