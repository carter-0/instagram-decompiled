package com.instagram.creation.toolbar;

import X.0qQ;
import X.AnonymousClass07Z;
import X.AnonymousClass11O;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C249703kE;
import X.C46834DmA;
import X.C46934Dno;
import X.C60188Jh7;
import X.C60449Jlh;
import X.C61860pz;
import X.C71362ch;
import X.DbV;
import X.DbW;
import X.EIR;
import X.JTO;
import X.MGY;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

public final class CreationToolbarView extends RecyclerView {
    public C60188Jh7 A00;
    public final C46834DmA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        C46834DmA dmA = new C46834DmA();
        this.A01 = dmA;
        DbV.A1A(getContext(), this);
        setAdapter(dmA);
        A11(new C60449Jlh(2));
    }

    public final ImageView getMusicPickerButton() {
        C249703kE A0W = A0W(0);
        if (A0W instanceof EIR) {
            return ((C46934Dno) A0W).A00;
        }
        return null;
    }

    public final void setViewModel(C60188Jh7 jh7) {
        0qQ.A0B(jh7, 0);
        this.A00 = jh7;
        C61860pz A1I = JTO.A1I(new MGY(this, (AnonymousClass4D7) null, 4), jh7.A06);
        AnonymousClass07Z A002 = C71362ch.A00(this);
        if (A002 != null) {
            AnonymousClass11O.A03(DbW.A0E(A002), A1I);
            return;
        }
        throw AnonymousClass7TE.A0z("No lifecycle owner found");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C46834DmA dmA = new C46834DmA();
        this.A01 = dmA;
        DbV.A1A(getContext(), this);
        setAdapter(dmA);
        A11(new C60449Jlh(2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        C46834DmA dmA = new C46834DmA();
        this.A01 = dmA;
        DbV.A1A(getContext(), this);
        setAdapter(dmA);
        A11(new C60449Jlh(2));
    }
}
