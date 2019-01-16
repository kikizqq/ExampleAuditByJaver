package com.aerothinker.plandb.config.audit;

import com.aerothinker.plandb.config.Constants;
import com.aerothinker.plandb.security.SecurityUtils;
import org.javers.spring.auditable.AuthorProvider;
import org.springframework.stereotype.Component;

@Component
public class JaversAuthorProvider implements AuthorProvider {

   @Override
   public String provide() {
       return SecurityUtils.getCurrentUserLogin().orElse(Constants.SYSTEM_ACCOUNT);
   }
}
