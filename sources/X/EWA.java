package X;

public enum EWA {
    UserActionFollow("create"),
    UserActionUnfollow("destroy"),
    UserActionCancelRequest("destroy"),
    UserActionIgnore("ignore"),
    UserActionApprove("approve"),
    UserActionBlock("block"),
    UserActionUnblock("unblock"),
    UserActionRemoveFollower("remove_follower");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        EWA[] ewaArr;
        A01 = 0oU.A00(ewaArr);
    }

    /* access modifiers changed from: public */
    EWA(String str) {
        this.A00 = str;
    }
}
