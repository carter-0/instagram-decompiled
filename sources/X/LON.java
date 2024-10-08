package X;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;

public final class LON {
    public View A00;
    public ListView A01;
    public PopupWindow A02;
    public K97 A03;
    public boolean A04;
    public boolean A05 = true;
    public final Context A06;
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final View A08;
    public final AnonymousClass4DH A09;
    public final UserSession A0A;
    public final C66481MTj A0B;
    public final boolean A0C;
    public final boolean A0D;

    public LON(Context context, View view, AnonymousClass4DH r9, UserSession userSession, C66481MTj mTj, boolean z, boolean z2) {
        this.A06 = context;
        this.A0A = userSession;
        this.A09 = r9;
        this.A08 = view;
        this.A0B = mTj;
        this.A0D = z;
        this.A0C = z2;
        this.A03 = new K97(context, z);
        View A082 = DbU.A08(LayoutInflater.from(this.A06), R.layout.mention_conversion_pop_up);
        this.A00 = A082;
        if (A082 != null) {
            ListView listView = (ListView) A082.requireViewById(R.id.mention_conversion_options_list_view);
            this.A01 = listView;
            if (listView != null) {
                listView.setFooterDividersEnabled(false);
                ListView listView2 = this.A01;
                if (listView2 != null) {
                    listView2.setOverScrollMode(2);
                    ListView listView3 = this.A01;
                    if (listView3 != null) {
                        listView3.setAdapter(this.A03);
                        View A0G = AnonymousClass7TF.A0G(A082, R.id.divider);
                        if (this.A0D) {
                            A0G.setVisibility(8);
                        }
                        ListView listView4 = this.A01;
                        if (listView4 != null) {
                            listView4.setOnItemClickListener(new LZH(this, 0));
                        }
                    }
                }
            }
            0qQ.A0F("mentionConversionOptionsListView");
            throw AnonymousClass00P.createAndThrow();
        }
        PopupWindow popupWindow = new PopupWindow();
        this.A02 = popupWindow;
        popupWindow.setInputMethodMode(1);
        PopupWindow popupWindow2 = this.A02;
        if (popupWindow2 != null) {
            popupWindow2.setBackgroundDrawable(this.A06.getDrawable(R.drawable.auto_dropdown_background));
            PopupWindow popupWindow3 = this.A02;
            if (popupWindow3 != null) {
                popupWindow3.setOutsideTouchable(true);
                PopupWindow popupWindow4 = this.A02;
                if (popupWindow4 != null) {
                    popupWindow4.setAnimationStyle(R.style.MentionConversionPopupStyle);
                    PopupWindow popupWindow5 = this.A02;
                    if (popupWindow5 != null) {
                        popupWindow5.setOnDismissListener(new LZL(this, 1));
                        return;
                    }
                }
            }
        }
        0qQ.A0F("popupWindow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A01() {
        this.A04 = true;
        PopupWindow popupWindow = this.A02;
        if (popupWindow == null) {
            0qQ.A0F("popupWindow");
            throw AnonymousClass00P.createAndThrow();
        } else if (!popupWindow.isShowing()) {
            return false;
        } else {
            popupWindow.dismiss();
            return true;
        }
    }

    public static final void A00(LON lon, User user, boolean z) {
        C62648KkA kkA;
        C66481MTj mTj = lon.A0B;
        if (mTj != null) {
            mTj.Dvr(user, z);
        }
        if (z) {
            kkA = C62648KkA.COLLAB;
        } else {
            kkA = C62648KkA.USER_TAG;
        }
        27r A012 = 27p.A01(lon.A0A);
        1Ln A0N = JTO.A0N(A012);
        C279294yP A0J = A012.A0J();
        AnonymousClass283 r4 = A012.A04;
        String str = r4.A0L;
        C59725JVj jVj = r4.A0C;
        if (!(!DbT.A1Y(A0N) || A0J == null || str == null || jVj == null)) {
            A0N.A0a(A0J);
            A0N.A0r("MENTION_PROMPT_TAP");
            JTQ.A1B(A0N, r4);
            A0N.A0d(jVj);
            JTO.A1U(A0N, str);
            JTQ.A1A(A0N);
            A0N.A0c(r4.A0A);
            AnonymousClass7TF.A18(A0N);
            ArrayList A0v = DbS.A0v(1);
            Object obj = new Object[]{kkA}[0];
            obj.getClass();
            A0v.add(obj);
            A0N.A0S("mention_prompt_options", Collections.unmodifiableList(A0v));
            A0N.Cgf();
        }
        int i = 2131966114;
        if (z) {
            i = 2131966113;
        }
        C310336ap A0W = DbV.A0W();
        A0W.A0B(C310356ar.CIRCULAR);
        A0W.A09 = user.Bh3();
        Context context = lon.A06;
        A0W.A0D = DbY.A0b(context, user, i);
        DbW.A0q(context, A0W, 2131975851);
        A0W.A0L = true;
        A0W.A0A = new C65360Ls0(lon, user, z);
        Dbb.A1Q(A0W);
    }
}
