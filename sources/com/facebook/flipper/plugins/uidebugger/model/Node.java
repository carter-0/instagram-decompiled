package com.facebook.flipper.plugins.uidebugger.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20470WsC;
import X.C20483WsP;
import X.C20805WzI;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C273654mx;
import X.C360278eK;
import X.C66579MXk;
import X.Pxd;
import X.VJ6;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Serializable
public final class Node {
    public static final C255463uA[] A0D;
    public static final Companion Companion = new Object();
    public final int A00;
    public final Bounds A01;
    public final BoxData A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Set A0B;
    public final JsonObject A0C;

    public final class Companion {
        public final C255463uA serializer() {
            return C20483WsP.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.Node$Companion, java.lang.Object] */
    static {
        C360278eK r1 = C360278eK.A00;
        C258613zM r7 = new C258613zM(r1, C20470WsC.A00);
        C255453u9 r0 = C255453u9.A01;
        A0D = new C255463uA[]{null, null, null, null, null, r7, new C258613zM(r0, r0), null, null, new C20805WzI(r0), new AnonymousClass409(r1), null, null};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Node) {
                Node node = (Node) obj;
                if (this.A00 != node.A00 || !0qQ.A0K(this.A05, node.A05) || !0qQ.A0K(this.A07, node.A07) || !0qQ.A0K(this.A06, node.A06) || !0qQ.A0K(this.A02, node.A02) || !0qQ.A0K(this.A09, node.A09) || !0qQ.A0K(this.A0A, node.A0A) || !0qQ.A0K(this.A0C, node.A0C) || !0qQ.A0K(this.A01, node.A01) || !0qQ.A0K(this.A0B, node.A0B) || !0qQ.A0K(this.A08, node.A08) || !0qQ.A0K(this.A04, node.A04) || !0qQ.A0K(this.A03, node.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Node(Bounds bounds, BoxData boxData, Boolean bool, Integer num, Integer num2, String str, String str2, List list, Map map, Map map2, Set set, JsonObject jsonObject, int i, int i2) {
        if (8191 != (i & 8191)) {
            VJ6.A00(C20483WsP.A01, i, 8191);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A05 = num;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = boxData;
        this.A09 = map;
        this.A0A = map2;
        this.A0C = jsonObject;
        this.A01 = bounds;
        this.A0B = set;
        this.A08 = list;
        this.A04 = num2;
        this.A03 = bool;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, ((this.A00 * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        int A072 = AnonymousClass7TF.A07(this.A09, (AnonymousClass7TF.A08(this.A06, A082) + AnonymousClass7TG.A0C(this.A02)) * 31);
        return ((AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A0A, A072) + AnonymousClass7TG.A0C(this.A0C)) * 31))) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node(id=");
        sb.append(this.A00);
        sb.append(", parent=");
        sb.append(this.A05);
        sb.append(", qualifiedName=");
        sb.append(this.A07);
        sb.append(", name=");
        sb.append(this.A06);
        sb.append(", boxData=");
        sb.append(this.A02);
        sb.append(C66579MXk.A00(421));
        sb.append(this.A09);
        sb.append(", inlineAttributes=");
        sb.append(this.A0A);
        sb.append(", hiddenAttributes=");
        sb.append(this.A0C);
        sb.append(", bounds=");
        sb.append(this.A01);
        sb.append(Pxd.A00(121));
        sb.append(this.A0B);
        sb.append(C273654mx.A00(198));
        sb.append(this.A08);
        sb.append(", activeChild=");
        sb.append(this.A04);
        sb.append(", additionalDataCollection=");
        return AnonymousClass7TG.A0n(this.A03, sb);
    }
}
