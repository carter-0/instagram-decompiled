package X;

/* renamed from: X.R8k  reason: case insensitive filesystem */
public final class C8759R8k extends 1P0 {
    public final /* synthetic */ AnonymousClass9EF A00;

    public C8759R8k(AnonymousClass9EF r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1757800997);
        C8759R8k.super.onFail(r5);
        Throwable A01 = r5.A01();
        if (A01 != null && (A01 instanceof C16693V1w)) {
            0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.graphql.error.GraphQLException");
            C249803kO A0J = C66580MXl.A0J(((C16693V1w) A01).A00);
            while (A0J.hasNext()) {
                String description = ((C13802ThL) A0J.next()).getDescription();
                if (description == null) {
                    description = "Session level survey fetch failed.";
                }
                0wb.A03("session_survey_controller", description);
            }
        }
        AnonymousClass0fD.A0A(-697003979, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr optionalTreeField;
        int A03 = AnonymousClass0fD.A03(1177612708);
        AnonymousClass3JC r8 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(-1648282325);
        0qQ.A0B(r8, 0);
        C250663lr r5 = (C250663lr) r8.A01;
        if (!(r5 == null || (optionalTreeField = r5.getOptionalTreeField(0, "ig_end_session_survey_uri_root_query(integration_point_id:$integration_point_id,session_id:$session_id,survey_context_data:$survey_context_data)", C7778QWp.class, -1279632481)) == null)) {
            AnonymousClass9EF r4 = this.A00;
            r4.A02 = optionalTreeField.getOptionalStringField(0, "survey_uri");
            if (optionalTreeField.hasFieldValue("survey_id")) {
                optionalTreeField.getCoercedIntField(1, "survey_id");
            }
            optionalTreeField.getOptionalStringField(3, "leaf_id");
            optionalTreeField.getOptionalStringField(2, "root_id");
            AnonymousClass7TF.A0D().post(new C73144PXf(r4));
        }
        AnonymousClass0fD.A0A(527460709, A032);
        AnonymousClass0fD.A0A(-799228489, A03);
    }
}
