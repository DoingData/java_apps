package ca.jrvs.apps.twitter;

import ca.jrvs.apps.twitter.Service.TwitterService;
import ca.jrvs.apps.twitter.Service.TwitterServiceImp;
import ca.jrvs.apps.twitter.dao.CrdRepository;
import ca.jrvs.apps.twitter.dao.TwitterRestDao;
import ca.jrvs.apps.twitter.dao.helper.ApacheHttpHelper;
import ca.jrvs.apps.twitter.dao.helper.HttpHelper;

public class TwitterCLI {

    public static void main(String[] args) {

        HttpHelper httpHelper = new ApacheHttpHelper();
        CrdRepository dao = new TwitterRestDao(httpHelper);
        TwitterService service = new TwitterServiceImp(dao);
        TwitterCLIRunner runner = new TwitterCLIRunner(service);
        runner.run(args);

    }


}