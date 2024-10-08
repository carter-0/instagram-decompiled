package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;

public final class K96 extends 2Rv implements C231272rL {
    public final List A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;

    public K96(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C249703kE onCreateViewHolder = onCreateViewHolder(viewGroup, JTP.A07(this, viewGroup, 2, i));
        onBindViewHolder(onCreateViewHolder, i);
        return JTO.A0F(onCreateViewHolder);
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C62440Kfq kfq;
        0qQ.A0B(viewGroup, 0);
        C62440Kfq[] kfqArr = C62440Kfq.A01;
        int length = kfqArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                kfq = C62440Kfq.A07;
                break;
            }
            kfq = kfqArr[i2];
            if (kfq.A00 == i) {
                break;
            }
            i2++;
        }
        return kfq.A00(AnonymousClass7TE.A0S(viewGroup), viewGroup);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public final void onBindViewHolder(C249703kE r18, int i) {
        C62440Kfq kfq;
        C60611JoK joK;
        C60549JnK jnK;
        boolean z;
        String str;
        C375999Gd r1;
        C249703kE r3 = r18;
        0qQ.A0B(r3, 0);
        List list = this.A00;
        int i2 = i;
        Object obj = list.get(i2);
        if (obj instanceof KNC) {
            kfq = C62440Kfq.A04;
        } else if (obj instanceof KNB) {
            kfq = C62440Kfq.A05;
        } else if (obj instanceof KND) {
            kfq = C62440Kfq.A06;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        UserSession userSession = this.A01;
        Context A06 = JTQ.A06(r3);
        C62771Km9 km9 = (C62771Km9) list.get(i2);
        if (kfq instanceof KNH) {
            return;
        }
        if (kfq instanceof KNG) {
            0qQ.A0B(userSession, 0);
            0qQ.A0B(km9, 3);
            KND knd = null;
            if (r3 instanceof C60549JnK) {
                jnK = (C60549JnK) r3;
            } else {
                jnK = null;
            }
            if (km9 instanceof KND) {
                knd = (KND) km9;
            }
            if (jnK != null && knd != null) {
                IgRadioGroup igRadioGroup = jnK.A00;
                igRadioGroup.removeAllViews();
                int i3 = 0;
                for (Object next : knd.A02) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C63850L9f l9f = (C63850L9f) next;
                    String str2 = knd.A01;
                    C60069Jex jex = new C60069Jex(A06);
                    jex.setId(i3);
                    String str3 = l9f.A04;
                    jex.setTag(str3);
                    C266444Yx r0 = l9f.A02;
                    if (r0 != null) {
                        jex.setTitleText(r0);
                    }
                    C266444Yx r02 = l9f.A01;
                    if (r02 != null) {
                        jex.setSubTitleText(r02);
                    }
                    C62555Khl khl = l9f.A03;
                    if (khl != null) {
                        int ordinal = khl.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                Class<C61442K7s> cls = C61442K7s.class;
                                C376009Ge A012 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(cls), userSession);
                                if (A012 == null || (r1 = A012.A00) == null || (str = r1.A00(AnonymousClass9F0.A00(cls), userSession)) == null) {
                                    str = "";
                                }
                                jex.setMetadataText(str);
                            } else if (!(ordinal == 2 || ordinal == 3)) {
                                throw AnonymousClass7TE.A1K();
                            }
                        }
                        str = AnonymousClass7TF.A0Q(userSession).getUsername();
                        jex.setMetadataText(str);
                    }
                    C266444Yx r03 = l9f.A00;
                    if (r03 != null) {
                        jex.setContentDescription(r03);
                    }
                    if (str2 != null) {
                        z = str2.equals(str3);
                    } else {
                        z = false;
                    }
                    jex.setChecked(z);
                    igRadioGroup.addView(jex, i3, new LinearLayout.LayoutParams(-1, -2));
                    i3 = i4;
                }
                igRadioGroup.A02 = knd.A00;
            }
        } else if (kfq instanceof KNF) {
            AnonymousClass7TF.A1C(userSession, 0, km9);
        } else {
            AnonymousClass7TF.A1C(userSession, 0, km9);
            KNC knc = null;
            if (r3 instanceof C60611JoK) {
                joK = (C60611JoK) r3;
            } else {
                joK = null;
            }
            if (km9 instanceof KNC) {
                knc = (KNC) km9;
            }
            if (joK != null && knc != null) {
                IgSimpleImageView igSimpleImageView = joK.A00;
                igSimpleImageView.setImageResource(R.drawable.instagram_x_pano_filled_24);
                AnonymousClass0fU.A00(knc.A00, igSimpleImageView);
                joK.A02.setText(2131957187);
                IgSimpleImageView igSimpleImageView2 = joK.A01;
                igSimpleImageView2.setImageResource(R.drawable.instagram_check_pano_filled_24);
                AnonymousClass0fU.A00(knc.A01, igSimpleImageView2);
            }
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(20765416);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-301563494, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C62440Kfq kfq;
        int A03 = AnonymousClass0fD.A03(1966139118);
        Object obj = this.A00.get(i);
        if (obj instanceof KNC) {
            kfq = C62440Kfq.A04;
        } else if (obj instanceof KNB) {
            kfq = C62440Kfq.A05;
        } else if (obj instanceof KND) {
            kfq = C62440Kfq.A06;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int i2 = kfq.A00;
        AnonymousClass0fD.A0A(-1287201536, A03);
        return i2;
    }

    public final int getViewTypeCount() {
        return C62440Kfq.values().length;
    }
}
