package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.TTw  reason: case insensitive filesystem */
public final class C13297TTw extends 0Yg implements C62320sa {
    public static final C13297TTw A00 = new C13297TTw();

    public C13297TTw() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        AnonymousClass0eM r3 = STI.A0C;
        return Pxe.A0Z(A0Q, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, Pxh.A0z("[fF]ull.?[nN]ame|[fF]irst.*[lL]ast.*[nN]ame|\\b[nN]ame|\\b[nN]ome|^[nN]ombre[s]$|[aA]pellidos y [nN]ombres|[nN]ombres y [aA]pellidos", Pxi.A0o(A0Q, "family-name", Pxh.A0z("[fF]amily.?[nN]ame|^[lL]ast.?[nN]ame|\\blname|[sS]urname|^[aA]pellido[s]$\"", Pxi.A0o(A0Q, "given-name", Pxh.A0z("[gG]iven.?[nN]ame|[fF]irst.?[nN]ame|\\bfname", Pxi.A0o(A0Q, "address-level1", Pxh.A0z("[rR]egion|[pP]rovince|[sS]tate|[eE]stado", Pxi.A0o(A0Q, "address-level2", Pxh.A0z("[cC]ity|[tT]own|[cC]idade", Pxi.A0o(A0Q, "postal-code", Pxh.A0z("[zZ][iI][pP]|[pP]ostal|[pP]ost.*[cC]ode", Pxi.A0o(A0Q, "country", Pxh.A0z("[cC]ountry", Pxi.A0o(A0Q, "address-line1", Pxh.A0z("address.*line|address[^\\[]?1|addr[^\\[]?1|[sS]treet|address.*one", Pxi.A0o(A0Q, "address-line2", Pxh.A0z("address.*line[^\\[]?2|address[^\\[]?2|addr[^\\[]?2|[sS]uite|[aA]partment|address.*two", Pxi.A0o(A0Q, "address-line3", Pxh.A0z("address.*line[^\\[]?3|address[^\\[]?3|addr[^\\[]?3|line[^\\[]?3|address.*three", Pxi.A0o(A0Q, "tel", Pxh.A0z("[pP]hone|[\b_][tT]el|[tT]el(f|eph)", Pxi.A0o(A0Q, "email", Pxh.A0z("[eE][- ]?mail|[uU]ser[\\-_\\s]?[nN]ame", (Set) r3.getValue()), r3)), r3)), r3)), r3)), r3)), r3)), r3)), r3)), r3)), r3)), r3)));
    }
}
