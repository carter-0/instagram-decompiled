package com.instagram.user.follow;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C15395Uby;
import X.C15459UdA;
import X.C66632Ma1;
import X.DbS;
import X.DbY;
import X.JTT;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.model.User;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BlockButton extends UpdatableButton {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public static final void A00(C15395Uby uby, BlockButton blockButton, User user) {
        Editable text;
        boolean z = !blockButton.A00;
        blockButton.A00 = z;
        blockButton.setIsBlueButton(!z);
        blockButton.refreshDrawableState();
        C15459UdA udA = uby.A00;
        if (udA == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        C66632Ma1 ma1 = new C66632Ma1(user);
        Set set = udA.A0B;
        if (set.contains(ma1)) {
            Set set2 = udA.A0C;
            if (set2.contains(ma1)) {
                set2.remove(ma1);
            } else {
                udA.A0D.add(ma1);
            }
            set.remove(ma1);
            udA.A0E.add(ma1);
        } else {
            Set set3 = udA.A0D;
            if (set3.contains(ma1)) {
                set3.remove(ma1);
            } else {
                udA.A0C.add(ma1);
            }
            udA.A0E.remove(ma1);
            set.add(ma1);
        }
        SearchEditText searchEditText = uby.A02;
        if (searchEditText != null && (text = searchEditText.getText()) != null && text.length() != 0) {
            SearchEditText searchEditText2 = uby.A02;
            if (searchEditText2 != null) {
                DbS.A1C(searchEditText2);
            }
            SearchEditText searchEditText3 = uby.A02;
            if (searchEditText3 != null) {
                searchEditText3.clearFocus();
            }
            SearchEditText searchEditText4 = uby.A02;
            if (searchEditText4 != null) {
                searchEditText4.A04();
            }
        }
    }

    public static final void A02(BlockButton blockButton, User user) {
        int i = 2131953909;
        if (blockButton.A00) {
            i = 2131953913;
        }
        blockButton.setText(i);
        Context A0S = AnonymousClass7TE.A0S(blockButton);
        boolean z = blockButton.A00;
        String B8Q = user.B8Q();
        int i2 = 2131953911;
        if (z) {
            i2 = 2131953914;
        }
        blockButton.setContentDescription(DbY.A0c(A0S, B8Q, i2));
        blockButton.setEnabled(true);
    }

    public /* synthetic */ BlockButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
