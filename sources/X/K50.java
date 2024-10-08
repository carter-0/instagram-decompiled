package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.api.schemas.CommentPromptImpl;

public final class K50 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CommentPromptCreationFragment";
    public View A00;
    public EditText A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "comment_prompt_creation";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0094: MOVE  (r2v4 com.instagram.actionbar.ActionButton) = (r2v3 com.instagram.actionbar.ActionButton)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            super.onViewCreated(r6, r7)
            r0 = 2131430515(0x7f0b0c73, float:1.8482733E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r5.A01 = r0
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = "args_comment_prompt_text"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x0025
            android.widget.EditText r0 = r5.A01
            if (r0 == 0) goto L_0x0025
            r0.setText(r1)
        L_0x0025:
            android.widget.EditText r2 = r5.A01
            if (r2 == 0) goto L_0x0032
            r1 = 1
            X.FKk r0 = new X.FKk
            r0.<init>(r5, r1)
            r2.addTextChangedListener(r0)
        L_0x0032:
            r0 = 2131430968(0x7f0b0e38, float:1.8483652E38)
            android.view.View r2 = r6.findViewById(r0)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "args_should_show_delete_prompt_button"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00cc
            r2.setVisibility(r4)
            r0 = 41
            X.FP5.A01(r2, r0, r5)
        L_0x004d:
            android.widget.EditText r1 = r5.A01
            if (r1 == 0) goto L_0x0060
            r1.requestFocus()
            X.JTR.A1F(r1)
            X.0nA.A0R(r1)
            r0 = 32768(0x8000, float:4.5918E-41)
            r1.sendAccessibilityEvent(r0)
        L_0x0060:
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 254(0xfe, float:3.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00cb
            r0 = 2131429582(0x7f0b08ce, float:1.848084E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r6, r0)
            r2.setVisibility(r4)
            r0 = 2131427513(0x7f0b00b9, float:1.8476644E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            r0 = 44
            X.FP5.A01(r1, r0, r5)
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r2 = r2.requireViewById(r0)
            r5.A00 = r2
            boolean r0 = r2 instanceof com.instagram.actionbar.ActionButton
            if (r0 == 0) goto L_0x00cb
            com.instagram.actionbar.ActionButton r2 = (com.instagram.actionbar.ActionButton) r2
            if (r2 == 0) goto L_0x00cb
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r2.setButtonResource(r0)
            android.content.Context r1 = r2.getContext()
            int r0 = X.2Yu.A0D(r1)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
            r0 = 45
            X.FP5.A01(r2, r0, r5)
            android.widget.EditText r0 = r5.A01
            r1 = 1
            if (r0 == 0) goto L_0x00c8
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x00c8
            r3 = 1
        L_0x00c8:
            r2.setEnabled(r3)
        L_0x00cb:
            return
        L_0x00cc:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K50.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(K50 k50) {
        Editable editable;
        AnonymousClass0eM r3 = k50.A02;
        C60120Jg1 jg1 = (C60120Jg1) r3.getValue();
        EditText editText = k50.A01;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        0qQ.A0B(valueOf, 0);
        jg1.A01.Epw(valueOf);
        ((C60120Jg1) r3.getValue()).A00.A0B(C63013Kq3.A00(new CommentPromptImpl((String) null, (Integer) null), LQD.A00().A01));
        DbT.A1J(k50);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public K50() {
        0Yh A0z = DbS.A0z(C60120Jg1.class);
        this.A02 = DbS.A0I(new C58710IwJ(this, 47), new C58710IwJ(this, 48), new C58188Ins(11, (Object) null, this), A0z);
    }

    public final void configureActionBar(2da r5) {
        Editable text;
        C59922Jbl A002 = C59922Jbl.A00(r5);
        C59922Jbl.A02(DbV.A05(this), A002, 2131956384);
        this.A00 = C59904JbT.A00(new FP5(this, 42), r5, A002);
        DbX.A1A(new FP5(this, 43), DbX.A0M(), r5);
        View view = this.A00;
        if (view != null) {
            EditText editText = this.A01;
            boolean z = false;
            if (!(editText == null || (text = editText.getText()) == null || !C51966G9m.A1X(text))) {
                z = true;
            }
            view.setEnabled(z);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2020064111);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.comment_prompt_creation_layout, false);
        AnonymousClass0fD.A09(-269245200, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(180464601);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-1262670056, A022);
    }
}
