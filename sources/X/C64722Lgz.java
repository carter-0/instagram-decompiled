package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Lgz  reason: case insensitive filesystem */
public final class C64722Lgz implements AnonymousClass4DR, TextWatcher {
    public View A00;
    public C66481MTj A01;
    public LON A02;
    public IgAutoCompleteTextView A03;
    public final Context A04;
    public final 28D A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final boolean A08;
    public final boolean A09;

    public C64722Lgz(28D r2, AnonymousClass4DH r3, UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A06 = r3;
        this.A05 = r2;
        this.A09 = z;
        this.A08 = z2;
        this.A04 = r3.requireContext();
    }

    public final void A00(View view, IgAutoCompleteTextView igAutoCompleteTextView) {
        0qQ.A0B(igAutoCompleteTextView, 0);
        this.A03 = igAutoCompleteTextView;
        this.A00 = view;
        igAutoCompleteTextView.addTextChangedListener(this);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A03;
        if (igAutoCompleteTextView2 == null) {
            0qQ.A0F("editText");
            throw AnonymousClass00P.createAndThrow();
        }
        igAutoCompleteTextView2.A03 = this;
        View view2 = this.A00;
        if (view2 != null) {
            this.A02 = new LON(this.A04, view2, this.A06, this.A07, this.A01, this.A09, this.A08);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void A01(User user, String str, String str2, List list, List list2) {
        int A1V;
        String str3;
        Boolean Ak3;
        User user2 = user;
        if (str2 == null || (Ak3 = user2.A03.Ak3()) == null || Ak3.booleanValue()) {
            List<PeopleTag> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (PeopleTag A072 : list3) {
                    if (DbV.A1Z(user2, A072.A07().getId())) {
                        return;
                    }
                }
            }
            if (list2 != null) {
                A1V = list2.size();
            } else {
                A1V = AnonymousClass7TF.A1V(str);
            }
            if (user2.A03.Ak2() != null && user2.A03.Cd0() != null) {
                UserSession userSession = this.A07;
                if (!ORH.A00(userSession, user2) && !LTZ.A0G(this.A05, userSession, Boolean.valueOf(this.A09), A1V) && list3.size() < 20) {
                    LON lon = this.A02;
                    if (lon == null) {
                        str3 = "mentionConversionView";
                    } else {
                        K97 k97 = lon.A03;
                        boolean z = lon.A0C;
                        k97.A06();
                        if (!z) {
                            String A0b = DbY.A0b(k97.A00, user2, 2131966112);
                            0qQ.A07(A0b);
                            k97.A09(k97.A01, new L95(user2, A0b, (String) null, R.drawable.instagram_tag_up_pano_outline_24, 0), 0);
                        }
                        int i = 2131966110;
                        if (k97.A02) {
                            i = 2131966109;
                        }
                        Context context = k97.A00;
                        String A0b2 = DbY.A0b(context, user2, 2131966111);
                        0qQ.A07(A0b2);
                        k97.A09(k97.A01, new L95(user2, A0b2, context.getString(i), R.drawable.instagram_collaborate_pano_outline_24, 1), 0);
                        k97.A07();
                        PopupWindow popupWindow = lon.A02;
                        str3 = "popupWindow";
                        if (popupWindow != null) {
                            popupWindow.setContentView(lon.A00);
                            int measuredWidth = lon.A08.getMeasuredWidth();
                            popupWindow.setWidth(measuredWidth);
                            int i2 = measuredWidth - 2;
                            K97 k972 = lon.A03;
                            int count = k972.getCount();
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < count) {
                                ListView listView = lon.A01;
                                if (listView == null) {
                                    str3 = "mentionConversionOptionsListView";
                                } else {
                                    View view = k972.getView(i4, (View) null, listView);
                                    0qQ.A07(view);
                                    view.measure(View.MeasureSpec.makeMeasureSpec(i2, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                                    i5 += view.getMeasuredHeight();
                                    i4++;
                                }
                            }
                            if (!lon.A0D) {
                                i3 = lon.A06.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
                            }
                            popupWindow.setHeight(i5 + i3 + 2);
                            lon.A04 = false;
                            lon.A07.postDelayed(new M3S(lon), 150);
                            return;
                        }
                    }
                    0qQ.A0F(str3);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        LON lon = this.A02;
        if (lon == null) {
            0qQ.A0F("mentionConversionView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lon.A01();
        }
    }

    public final boolean onBackPressed() {
        LON lon = this.A02;
        if (lon != null) {
            return lon.A01();
        }
        0qQ.A0F("mentionConversionView");
        throw AnonymousClass00P.createAndThrow();
    }
}
