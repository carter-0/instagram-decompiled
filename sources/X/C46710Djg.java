package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Djg  reason: case insensitive filesystem */
public final class C46710Djg extends BaseAdapter {
    public View A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;
    public boolean A03 = false;
    public final List A04 = AnonymousClass7TE.A1C();
    public final Context A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final E6T A08;
    public final C51960G9g A09;
    public final C46432Det A0A;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        int i2 = 3;
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        for (F2g f2g : this.A04) {
            if (i >= i2) {
                int i3 = f2g.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return 0;
                    }
                    if (i4 != i3 - 1) {
                        return 1;
                    }
                    if (f2g.A00 < f2g.A05.size() || f2g.A02 != null) {
                        return 2;
                    }
                    return 1;
                }
            }
            i2 += f2g.A01;
        }
        return -1;
    }

    public final int getViewTypeCount() {
        return 6;
    }

    public final int getCount() {
        if (this.A03) {
            return 4;
        }
        int i = 3;
        if (this.A02) {
            return this.A01.size() + 3;
        }
        for (F2g f2g : this.A04) {
            i += f2g.A01;
        }
        return i;
    }

    public final Object getItem(int i) {
        int i2 = 3;
        for (F2g f2g : this.A04) {
            if (i >= i2) {
                int i3 = f2g.A01;
                if (i < i3 + i2) {
                    int i4 = i - i2;
                    if (i4 == 0) {
                        return f2g.A04;
                    }
                    if (i4 != i3 - 1 || (f2g.A00 >= f2g.A05.size() && f2g.A02 == null)) {
                        return f2g.A05.get(i4 - 1);
                    }
                    return null;
                }
            }
            i2 += f2g.A01;
        }
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A002;
        F1C f1c;
        UserSession userSession;
        Object item;
        String A0h;
        LayoutInflater layoutInflater;
        int i2;
        int i3 = i;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        Context context = viewGroup2.getContext();
        if (context == null) {
            return view;
        }
        if (!this.A03 || i3 < 3) {
            if (!this.A02 || i3 < 3) {
                int itemViewType = getItemViewType(i3);
                if (itemViewType == 0) {
                    View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup2, R.layout.sac_nux_follow_accounts_header_row);
                    A0C.setTag(new C49363EuR(A0C));
                    if (getItem(i3) == null) {
                        return A0C;
                    }
                    String username = ((User) getItem(i3)).getUsername();
                    TextView textView = ((C49363EuR) DbT.A0o(A0C)).A00;
                    DbX.A13(textView.getContext(), textView, username, 2131962532);
                    return A0C;
                } else if (itemViewType == 1) {
                    A002 = FFX.A00(context, viewGroup2);
                    if (getItem(i3) == null) {
                        return A002;
                    }
                    f1c = (F1C) DbT.A0o(A002);
                    userSession = this.A07;
                    item = getItem(i3);
                } else if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        layoutInflater = LayoutInflater.from(context);
                        i2 = R.layout.sac_nux_follow_accounts_page_header_row;
                    } else if (itemViewType == 4) {
                        layoutInflater = LayoutInflater.from(context);
                        i2 = R.layout.sac_nux_follow_accounts_description_row;
                    } else if (itemViewType != 5) {
                        return view2;
                    } else {
                        View view3 = this.A00;
                        view3.getClass();
                        return view3;
                    }
                    return layoutInflater.inflate(i2, viewGroup2, false);
                } else {
                    View A0C2 = DbT.A0C(LayoutInflater.from(context), viewGroup2, R.layout.sac_nux_follow_accounts_see_more_row);
                    A0C2.setTag(new C49364EuS(A0C2));
                    int i4 = 3;
                    for (F2g f2g : this.A04) {
                        if (i3 < i4 || i3 >= f2g.A01 + i4) {
                            i4 += f2g.A01;
                        } else {
                            C49364EuS euS = (C49364EuS) DbT.A0o(A0C2);
                            int size = f2g.A05.size();
                            int i5 = f2g.A00;
                            Integer B70 = f2g.A04.A03.B70();
                            int i6 = size - i5;
                            int i7 = 10;
                            if (f2g.A03) {
                                i7 = 50;
                            }
                            if (i6 >= i7) {
                                i6 = i7;
                            } else if (f2g.A02 != null) {
                                if (B70 != null) {
                                    i6 = Math.min(B70.intValue() - i5, i7);
                                } else {
                                    i6 = -1;
                                }
                            }
                            E6T e6t = this.A08;
                            TextView textView2 = euS.A00;
                            Context context2 = textView2.getContext();
                            if (i6 == -1) {
                                A0h = context2.getString(2131962533);
                            } else {
                                A0h = DbW.A0h(context2, Integer.valueOf(i6), 2131962534);
                            }
                            textView2.setText(A0h);
                            FPA.A00(textView2, e6t, f2g, i6, 21);
                            return A0C2;
                        }
                    }
                    return A0C2;
                }
            } else {
                A002 = FFX.A00(context, viewGroup2);
                f1c = (F1C) DbT.A0o(A002);
                userSession = this.A07;
                item = this.A01.get(i - 3);
            }
            C51960G9g g9g = this.A09;
            FFX.A02((Activity) null, this.A05, this.A06, userSession, (Reel) null, (User) item, (C46443Df5) null, (FAU) null, g9g, f1c, this.A0A, false, true, false, false);
            return A002;
        }
        View A003 = C49162EqT.A00(LayoutInflater.from(context), viewGroup2);
        C48234EbF ebF = (C48234EbF) DbT.A0o(A003);
        String string = context.getResources().getString(2131968486);
        0qQ.A0B(ebF, 0);
        ebF.A01.setText(string);
        return A003;
    }

    public C46710Djg(Context context, AnonymousClass0iw r3, UserSession userSession, E6T e6t, C51960G9g g9g, C46432Det det) {
        this.A05 = context;
        this.A07 = userSession;
        this.A08 = e6t;
        this.A09 = g9g;
        this.A06 = r3;
        this.A0A = det;
    }
}
