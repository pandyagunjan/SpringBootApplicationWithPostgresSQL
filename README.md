To configure the AWS S3 below link was referred

https://medium.com/oril/uploading-files-to-aws-s3-bucket-using-spring-boot-483fcb6f8646

Note that the @PostConstruct in the AmazonClient.java file mentioned in above link is deprecated hence 
there the builder is used instead.

_this.s3client = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
.withRegion(Regions.US_EAST_2).build();_