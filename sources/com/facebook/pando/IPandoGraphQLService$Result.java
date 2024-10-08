package com.facebook.pando;

import X.0qQ;
import X.C273654mx;

public final class IPandoGraphQLService$Result {
    public final IPandoGraphQLService$Token cancelToken;
    public final Object tree;

    public IPandoGraphQLService$Result(Object obj, IPandoGraphQLService$Token iPandoGraphQLService$Token) {
        0qQ.A0B(iPandoGraphQLService$Token, 2);
        this.tree = obj;
        this.cancelToken = iPandoGraphQLService$Token;
    }

    public final Object component1() {
        return this.tree;
    }

    public final IPandoGraphQLService$Token component2() {
        return this.cancelToken;
    }

    public final IPandoGraphQLService$Result copy(Object obj, IPandoGraphQLService$Token iPandoGraphQLService$Token) {
        0qQ.A0B(iPandoGraphQLService$Token, 1);
        return new IPandoGraphQLService$Result(obj, iPandoGraphQLService$Token);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IPandoGraphQLService$Result) {
                IPandoGraphQLService$Result iPandoGraphQLService$Result = (IPandoGraphQLService$Result) obj;
                if (!0qQ.A0K(this.tree, iPandoGraphQLService$Result.tree) || !0qQ.A0K(this.cancelToken, iPandoGraphQLService$Result.cancelToken)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.tree;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.cancelToken.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result(tree=");
        sb.append(this.tree);
        sb.append(C273654mx.A00(1043));
        sb.append(this.cancelToken);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ IPandoGraphQLService$Result copy$default(IPandoGraphQLService$Result iPandoGraphQLService$Result, Object obj, IPandoGraphQLService$Token iPandoGraphQLService$Token, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = iPandoGraphQLService$Result.tree;
        }
        if ((i & 2) != 0) {
            iPandoGraphQLService$Token = iPandoGraphQLService$Result.cancelToken;
        }
        0qQ.A0B(iPandoGraphQLService$Token, 1);
        return new IPandoGraphQLService$Result(obj, iPandoGraphQLService$Token);
    }
}
