package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OzE  reason: case insensitive filesystem */
public final class C72246OzE implements C2365734g {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C331677Rx A01;

    public C72246OzE(View view, C331677Rx r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.2tF, java.lang.Object] */
    public final void DKS(View view) {
        String str;
        0qQ.A0B(view, 0);
        C331677Rx r3 = this.A01;
        C62320sa r2 = r3.A0D;
        AnonymousClass3E6 r1 = (AnonymousClass3E6) r2.invoke();
        if (r1 != null) {
            r1.A9Y((C252213ok) r3.A0C.getValue());
        }
        AnonymousClass3E6 r12 = (AnonymousClass3E6) r2.invoke();
        if (r12 != null) {
            JTP.A17(r3.A0B, r12);
        }
        r3.A03 = view.findViewById(R.id.ai_suggested_reply_shadow);
        r3.A01 = view.findViewById(R.id.ai_suggested_reply_container);
        View findViewById = view.findViewById(R.id.ai_suggested_reply_header);
        r3.A00 = findViewById;
        if (findViewById == null) {
            str = "header";
        } else {
            C71403Ok2.A01(findViewById, 30, r3);
            IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.suggested_reply_edit_button);
            r3.A08 = igdsButton;
            if (igdsButton == null) {
                str = "edit";
            } else {
                C71403Ok2.A01(igdsButton, 31, r3);
                IgdsButton igdsButton2 = (IgdsButton) view.findViewById(R.id.suggested_reply_send_button);
                r3.A0A = igdsButton2;
                String str2 = "send";
                if (igdsButton2 != null) {
                    igdsButton2.A02(C273084lx.START, R.drawable.instagram_direct_filled_16);
                    IgdsButton igdsButton3 = r3.A0A;
                    if (igdsButton3 != null) {
                        igdsButton3.setIconPadding(AnonymousClass7TE.A0D(view.getResources()));
                        IgdsButton igdsButton4 = r3.A0A;
                        if (igdsButton4 != null) {
                            C71403Ok2.A01(igdsButton4, 32, r3);
                            IgdsButton igdsButton5 = (IgdsButton) view.findViewById(R.id.suggested_reply_refresh_button);
                            r3.A09 = igdsButton5;
                            if (igdsButton5 == null) {
                                str = "refresh";
                            } else {
                                C71403Ok2.A01(igdsButton5, 33, r3);
                                IgdsButton igdsButton6 = (IgdsButton) view.findViewById(R.id.suggested_reply_cancel_button);
                                r3.A07 = igdsButton6;
                                if (igdsButton6 == null) {
                                    str = "cancel";
                                } else {
                                    C71403Ok2.A01(igdsButton6, 34, r3);
                                    AnonymousClass2tC A002 = AnonymousClass2t9.A00(this.A00.getContext());
                                    A002.A01(new C68611NPh(r3.A00.A00));
                                    r3.A05 = DbU.A0U(A002, new Object());
                                    RecyclerView A0F = DbZ.A0F(view, R.id.suggested_reply_messages);
                                    r3.A04 = A0F;
                                    if (A0F == null) {
                                        str = "messageListRecyclerView";
                                    } else {
                                        AnonymousClass2t9 r0 = r3.A05;
                                        if (r0 == null) {
                                            str2 = "messageListRecyclerViewAdapter";
                                        } else {
                                            A0F.setAdapter(r0);
                                            View findViewById2 = view.findViewById(R.id.ai_suggested_reply_settings);
                                            r3.A02 = findViewById2;
                                            if (findViewById2 == null) {
                                                str2 = "settings";
                                            } else {
                                                C71403Ok2.A01(findViewById2, 35, r3);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
